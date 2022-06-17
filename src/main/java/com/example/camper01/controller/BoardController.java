package com.example.camper01.controller;


import com.example.camper01.domain.BoardVO;
import com.example.camper01.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService board;

    @GetMapping("/write")
    public String boardWrite() {
        return "redirect:/list";
    }

    @GetMapping("/read/{bdNum}")
    public String readBoard(@PathVariable(value = "bdNum") Long bdNum, Model model) {
        BoardVO vo = board.readBoard(bdNum);
        model.addAttribute("vo", vo);
        return "redirect:/read/{bdNum}";
    }

    @GetMapping("/list")
    public String listBoard(Model model) {
        model.addAttribute("board", board.listBoard());
        return "redirect:/list";
    }
}
