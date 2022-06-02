package com.example.camper01.mapper;

import com.example.camper01.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public int insertBoard(BoardVO vo);

    public int updateBoard(BoardVO vo);

    public int deleteBoard(Long bdNum);

    public BoardVO listBoard(BoardVO vo);

    public BoardVO readBoard(Long bdNum);
}
