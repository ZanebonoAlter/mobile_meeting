package org.bumblebee.service.Impl;

import org.bumblebee.dao.VoteMapper;
import org.bumblebee.dao.VotedetailMapper;
import org.bumblebee.dao.VoterecordMapper;
import org.bumblebee.entity.*;
import org.bumblebee.service.VoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {
    @Resource
    private VoteMapper voteMapper;
    @Resource
    private VotedetailMapper votedetailMapper;
    @Resource
    private VoterecordMapper voterecordMapper;
    @Override
    public List<Vote> getVoteByRoomId(Integer roomId) {
        VoteExample example = new VoteExample();
        VoteExample.Criteria criteria = example.createCriteria();
        criteria.andVoteRoomIdEqualTo(roomId);
        return voteMapper.selectByExample(example);
    }

    @Override
    public List<Vote> getVoteAvaliableByRoomId(Integer roomId) {
        VoteExample example = new VoteExample();
        VoteExample.Criteria criteria = example.createCriteria();
        criteria.andVoteRoomIdEqualTo(roomId);
        criteria.andVoteStateEqualTo(1);
        return voteMapper.selectByExample(example);
    }

    @Override
    public Integer createVote(Integer roomId, Integer userId, Date startTime, Date endTime) {
        Vote vote = new Vote();
        vote.setVoteRoomId(roomId);
        vote.setVoteUserId(userId);
        vote.setVoteStartTime(startTime);
        vote.setVoteEndTime(endTime);
        voteMapper.insertSelective(vote);
        return vote.getVoteId();
    }

    @Override
    public Integer createVoteDetail(String vote_item, Integer voteId) {
        Votedetail votedetail = new Votedetail();
        votedetail.setVdItem(vote_item);
        votedetail.setVdVoteId(voteId);
        votedetailMapper.insertSelective(votedetail);
        return votedetail.getVdId();
    }

    @Override
    public Integer userVote( Integer userId, Integer voteDetail_id) {
        Voterecord voterecord = new Voterecord();
        voterecord.setVrUserId(userId);
        voterecord.setVrVdId(voteDetail_id);
        return voterecordMapper.insertSelective(voterecord);
    }

    @Override
    public List<Votedetail> getVoteDetailByVoteId(Integer voteId) {
        VotedetailExample example = new VotedetailExample();
        VotedetailExample.Criteria criteria = example.createCriteria();
        criteria.andVdVoteIdEqualTo(voteId);
        return votedetailMapper.selectByExample(example);
    }
}
