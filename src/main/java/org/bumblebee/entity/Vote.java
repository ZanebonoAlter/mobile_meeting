package org.bumblebee.entity;

import java.io.Serializable;
import java.util.Date;

public class Vote implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private Integer voteId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_name
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private String voteName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_user_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private Integer voteUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_room_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private Integer voteRoomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_start_time
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private Date voteStartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_end_time
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private Date voteEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote.vote_state
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private Integer voteState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table vote
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_id
     *
     * @return the value of vote.vote_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public Integer getVoteId() {
        return voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_id
     *
     * @param voteId the value for vote.vote_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_name
     *
     * @return the value of vote.vote_name
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public String getVoteName() {
        return voteName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_name
     *
     * @param voteName the value for vote.vote_name
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public void setVoteName(String voteName) {
        this.voteName = voteName == null ? null : voteName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_user_id
     *
     * @return the value of vote.vote_user_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public Integer getVoteUserId() {
        return voteUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_user_id
     *
     * @param voteUserId the value for vote.vote_user_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public void setVoteUserId(Integer voteUserId) {
        this.voteUserId = voteUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_room_id
     *
     * @return the value of vote.vote_room_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public Integer getVoteRoomId() {
        return voteRoomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_room_id
     *
     * @param voteRoomId the value for vote.vote_room_id
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public void setVoteRoomId(Integer voteRoomId) {
        this.voteRoomId = voteRoomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_start_time
     *
     * @return the value of vote.vote_start_time
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public Date getVoteStartTime() {
        return voteStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_start_time
     *
     * @param voteStartTime the value for vote.vote_start_time
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public void setVoteStartTime(Date voteStartTime) {
        this.voteStartTime = voteStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_end_time
     *
     * @return the value of vote.vote_end_time
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public Date getVoteEndTime() {
        return voteEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_end_time
     *
     * @param voteEndTime the value for vote.vote_end_time
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public void setVoteEndTime(Date voteEndTime) {
        this.voteEndTime = voteEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote.vote_state
     *
     * @return the value of vote.vote_state
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public Integer getVoteState() {
        return voteState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote.vote_state
     *
     * @param voteState the value for vote.vote_state
     *
     * @mbggenerated Wed Sep 26 10:10:03 CST 2018
     */
    public void setVoteState(Integer voteState) {
        this.voteState = voteState;
    }
}