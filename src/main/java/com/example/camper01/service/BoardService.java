package com.example.camper01.service;

import com.example.camper01.domain.BoardVO;
import com.example.camper01.mapper.BoardMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Setter(onMethod_ = @Autowired)

    private BoardMapper mapper;

    public boolean insertBoard(BoardVO vo) {
        return mapper.insertBoard(vo) == 1;
    }

    public boolean updateBoard(BoardVO vo) {
        return mapper.updateBoard(vo) == 1;
    }

    public boolean deleteBoard(Long bdNum) {
        return mapper.deleteBoard(bdNum) == 1;
    }

    public BoardVO listBoard(BoardVO vo) {
        return mapper.listBoard(vo);
    }

    public BoardVO readBoard(Long bdNum) {
        return mapper.readBoard(bdNum);
    }
}
