package com.lmash.mysqltest.service;

import com.lmash.mysqltest.mapper.UserMapper;
import com.lmash.mysqltest.pojo.User;
import com.lmash.mysqltest.pojo.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/10/17.
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 用户注册
     * @param user
     * @return
     */
    public int createUser(User user){
        return userMapper.insert(user);
    }

    /**
     * 用户登录
     * @throws Exception
     */
    public void userLogin() throws Exception{

    };

    /**
     * 根据条件自定义查询
     * @param example
     * @return
     */
    public List<User> selectUserByUserExample(UserExample example){
        return userMapper.selectByExample(example);
    }

    /**
     * 根据指定条件查询用户数量
     * @param example
     * @return
     */
    public int QueryUserCount(UserExample example) {
        return userMapper.queryCountUserByExample(example);
    }

}
