package org.bumblebee.service;

import org.bumblebee.entity.Vote;
import org.bumblebee.entity.Votedetail;

import java.util.Date;
import java.util.List;

public interface VoteService {
    /*
    根据房间id获取所有投票
     */
    public List<Vote> getVoteByRoomId(Integer roomId);
    /*
    根据房间id获取正在进行中的投票
     */
    public List<Vote> getVoteAvaliableByRoomId(Integer roomId);
    /*
    发起投票,需要改mapper拿到id
     */
    public Integer createVote(Integer roomId, Integer userId, Date startTime,Date endTime);
    /*
    增加投票选项,需要改mapper拿到id
     */
    public Integer createVoteDetail(String vote_item,Integer voteId);
    /*
    用户投票
     */
    public Integer userVote(Integer userId,Integer voteDetail_id);
    /*
    根据voteId获取所有选项
     */
    public List<Votedetail> getVoteDetailByVoteId(Integer voteId);
}
