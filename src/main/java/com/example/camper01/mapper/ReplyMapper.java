package com.example.camper01.mapper;

import com.example.camper01.domain.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {
    public int insertReply(ReplyVO vo);

    public int deleteReply(Long repNum);

    public ReplyVO readReply(ReplyVO vo, Long bdNum);
}
