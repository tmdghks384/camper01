package com.example.camper01.mapper;

import com.example.camper01.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public int insertBoard(BoardVO vo);

    public int updateBoard(BoardVO vo);

    public int deleteBoard(Long bdNum);

    public List<BoardVO> listBoard();

    public BoardVO readBoard(Long bdNum);
}
