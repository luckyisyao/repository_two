package com.lmash.mysqltest.controller;

import com.lmash.mysqltest.pojo.User;
import com.lmash.mysqltest.pojo.UserExample;
import com.lmash.mysqltest.service.UserService;
import com.lmash.mysqltest.util.IDNumberUtil;
import com.lmash.mysqltest.util.MyStringUtil;
import com.lmash.mysqltest.util.NumberUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/10/17.
 */
@RestController
@RequestMapping(value = "/User")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/createUser",method = RequestMethod.POST)
    public Map<String,Object> createUser(User user){
        Map<String,Object> map = new HashMap<>();

        //效验身份证是否合格
        if (!IDNumberUtil.isIDNumber(user.getIdCard())){
            map.put("mark",false);
            map.put("message","身份证号码不正确");
            return map;
        }

        //对性别的效验(性别(0未知，1男，2女))
        if("0".equals(user.getGender())){
            user.setGender("未知性别");
        }else if ("1".equals(user.getGender())){
            user.setGender("男");
        }else if ("2".equals(user.getGender())){
            user.setGender("女");
        }else {
            map.put("mark",false);
            map.put("message","性别输入有误");
            return map;
        }

        //人员级别 (0普通员工，1管理员)
        if (user.getIsManager() == null){
            map.put("mark",false);
            map.put("message","人员级别不能为空");
            return map;
        }

        String[] mananger = {"0","1"};
        boolean b = Arrays.asList(mananger).contains(user.getIsManager());
        if (!b){
            map.put("mark",false);
            map.put("message","人员级别输入有误");
            return map;
        }

        //判断用户是否已经注册
        UserExample example = new UserExample();
        example.or().andIdCardEqualTo(user.getIdCard());
        List<User> userList = userService.selectUserByUserExample(example);
        if (userList.size() >= 1){
            map.put("mark",false);
            map.put("message","用户已经注册");
            return map;
        }

        //获取邀请码
        if (MyStringUtil.isNullOrEmpty(user.getInvitationCode())){
            map.put("mark",false);
            map.put("message","请输入邀请码");
            return map;
        }

        //判断邀请码是否为数字字母组合的6位
        if (!NumberUtil.isNumber(user.getInvitationCode())){
            map.put("mark",false);
            map.put("message","邀请码输入有误");
            return map;
        }

        //如果人员级别为1，则生成6位随机邀请码
        if (user.getIsManager() == 1){
            String invitationCode = null;
            UserExample example1 = new UserExample();

            breakFor:for (;;){
                invitationCode = MyStringUtil.createRandomCode();

                //判断是否存在指定的邀请码
                example1.or().andInvitationCodeEqualTo(invitationCode);
                int count = userService.QueryUserCount(example1);
                if (count == 0){
                    break breakFor;
                }
            }
            user.setInvitationCode(invitationCode);
            map.put("invitationCode",invitationCode);
        }

        //添加人员到数据库
        int user1 = userService.createUser(user);
        if (user1>0){
            map.put("message","注册成功");
        }

        //返回注册用户ID
        UserExample example2 = new UserExample();
        example2.or().andIdCardEqualTo(user.getIdCard());
        User user2 = userService.selectUserByUserExample(example2).get(0);
        map.put("UserId",user2.getUserId());

        return map;
    }



    /**
     * 登录
     * @param user
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String,Object> login(User user){

        Map<String,Object> map = new HashMap();
        UserExample example = new UserExample();

        //效验用户的身份证
        //身份证号码不允许为空
        if (MyStringUtil.isNullOrEmpty(user.getIdCard())){
            map.put("mark",false);
            map.put("message","请输入身份证号码");
            return map;
        }
        //密码不允许为空
        if (MyStringUtil.isNullOrEmpty(user.getPassword())){
            map.put("mark",false);
            map.put("message","请输入密码");
            return map;
        }

        example.or().andIdCardEqualTo(user.getIdCard());
        List<User> userList = userService.selectUserByUserExample(example);
        if (userList.size() == 0){
            map.put("mark",false);
            map.put("message","用户不存在");
            return map;
        }
        //根据查询到的用户与前端客户输入的密码进行比较
        User user1 = userList.get(0);
        if (!user1.getPassword().equals(user.getPassword())){
            map.put("mark",false);
            map.put("message","密码错误，请重新输入");
            return map;
        }


        return map;
    }


}
