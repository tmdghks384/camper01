package com.example.camper01.controller;

import com.example.camper01.domain.UserVO;
import com.example.camper01.service.UserService;
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
public class UserController {
    private final UserService user;

    @GetMapping("/")
    public String main() {
        return "user/login";
    }

    @GetMapping("/user/join")
    public String join() {
        return "user/join";
    }

    @GetMapping("/user/myPage/{userNum}")
    public String myPage(@PathVariable("userNum") Long userNum, Model model) {
        model.addAttribute("user", user.readUser(userNum));
        return "user/myPage";
    }
}
