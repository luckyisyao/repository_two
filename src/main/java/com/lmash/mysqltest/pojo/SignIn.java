package com.lmash.mysqltest.pojo;

import java.util.Date;

public class SignIn {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_sign_in.sign_in_id
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    private Integer signInId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_sign_in.user_id
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_sign_in.sign_in_date
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    private Date signInDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_sign_in.create_time
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_sign_in.sign_in_id
     *
     * @return the value of x_sign_in.sign_in_id
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public Integer getSignInId() {
        return signInId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_sign_in.sign_in_id
     *
     * @param signInId the value for x_sign_in.sign_in_id
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void setSignInId(Integer signInId) {
        this.signInId = signInId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_sign_in.user_id
     *
     * @return the value of x_sign_in.user_id
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_sign_in.user_id
     *
     * @param userId the value for x_sign_in.user_id
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_sign_in.sign_in_date
     *
     * @return the value of x_sign_in.sign_in_date
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public Date getSignInDate() {
        return signInDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_sign_in.sign_in_date
     *
     * @param signInDate the value for x_sign_in.sign_in_date
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void setSignInDate(Date signInDate) {
        this.signInDate = signInDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_sign_in.create_time
     *
     * @return the value of x_sign_in.create_time
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_sign_in.create_time
     *
     * @param createTime the value for x_sign_in.create_time
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}