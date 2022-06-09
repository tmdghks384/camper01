package com.example.camper01.service;

import com.example.camper01.domain.MemberVO;
import com.example.camper01.domain.UserVO;
import com.example.camper01.mapper.MemberMapper;
import com.example.camper01.domain.MemberVO;
import com.example.camper01.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Log4j2
@Transactional
@RequiredArgsConstructor
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public List<MemberVO> getMemberList(){
        List<MemberVO> memberVOList = memberMapper.getMemberList();

        return memberVOList;
    }

    public int addMember(MemberVO memberVO){
        return memberMapper.addMember(memberVO);
    }

    public MemberVO loginUser(MemberVO member){
        return memberMapper.loginUser(member);
    }
}
