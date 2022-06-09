package com.example.camper01.mapper;

import com.example.camper01.domain.MemberVO;
import com.example.camper01.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    public List<MemberVO> getMemberList();

    public int addMember(MemberVO member);

    public MemberVO loginUser(MemberVO member);
}