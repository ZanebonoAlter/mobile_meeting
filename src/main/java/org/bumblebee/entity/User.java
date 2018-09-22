package org.bumblebee.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_iphone
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    private String userIphone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_img
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    private String userImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_state
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    private Integer userState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_iphone
     *
     * @return the value of user.user_iphone
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public String getUserIphone() {
        return userIphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_iphone
     *
     * @param userIphone the value for user.user_iphone
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public void setUserIphone(String userIphone) {
        this.userIphone = userIphone == null ? null : userIphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_img
     *
     * @return the value of user.user_img
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public String getUserImg() {
        return userImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_img
     *
     * @param userImg the value for user.user_img
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_state
     *
     * @return the value of user.user_state
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public Integer getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_state
     *
     * @param userState the value for user.user_state
     *
     * @mbggenerated Sat Sep 22 13:17:08 CST 2018
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }
}