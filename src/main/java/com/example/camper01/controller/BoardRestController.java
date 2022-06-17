package com.example.camper01.controller;

import com.example.camper01.domain.BoardVO;
import com.example.camper01.domain.MemberVO;
import com.example.camper01.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/board/rest/*")
@Log4j2
@RequiredArgsConstructor
public class BoardRestController {
    private final BoardService board;

    @PostMapping("/write")
    @ResponseBody
    public ResponseEntity<String> boardWrite(@RequestBody BoardVO vo, HttpSession session) {
        boolean isInserted = board.insertBoard(vo);
        MemberVO memberVO = (MemberVO) session.getAttribute("email");
        vo.setEmail(memberVO.getEmail());
        log.info(vo);

        try {
            if (isInserted == true) {
                log.info("등록 완료");
            }
        } catch (Exception e) {
            log.warn("에러 발생");
        }

        return new ResponseEntity<>("등록 완료", HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<String> boardDelete(HttpServletRequest request) {
        boolean isDeleted = board.deleteBoard((Long) request.getAttribute("bdNum"));
        return new ResponseEntity<>("삭제 완료", HttpStatus.OK);
    }
}
