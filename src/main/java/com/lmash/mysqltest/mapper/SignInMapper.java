package com.lmash.mysqltest.mapper;

import com.lmash.mysqltest.pojo.SignIn;
import com.lmash.mysqltest.pojo.SignInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignInMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    long countByExample(SignInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int deleteByExample(SignInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int deleteByPrimaryKey(Integer signInId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int insert(SignIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int insertSelective(SignIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    List<SignIn> selectByExample(SignInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    SignIn selectByPrimaryKey(Integer signInId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") SignIn record, @Param("example") SignInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int updateByExample(@Param("record") SignIn record, @Param("example") SignInExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int updateByPrimaryKeySelective(SignIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    int updateByPrimaryKey(SignIn record);
}