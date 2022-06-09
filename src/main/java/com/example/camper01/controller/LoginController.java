package com.example.camper01.controller;

import com.example.camper01.domain.MemberVO;
import com.example.camper01.domain.UserVO;
import com.example.camper01.mapper.MemberMapper;
import com.example.camper01.service.UserService;
import com.example.camper01.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Log4j2
public class LoginController {

    @Autowired
    UserService user;
    @Autowired
    MemberService memberService;
    @Autowired
    SqlSession sqlSession;

    @GetMapping("/register")
    public String register(Model model){
        return "/register";
    }

    @PostMapping("/register")
    public String addMember(MemberVO memberVO){
        memberService.addMember(memberVO);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "/login";
    }

    @PostMapping("/login")
    public String memberLogin(MemberVO memberVO, HttpServletRequest request, RedirectAttributes redirectAttributes)throws Exception{
        HttpSession session = request.getSession();
        MemberVO member = memberService.loginUser(memberVO);

        if(member == null){
            session.setAttribute("member", null);
            redirectAttributes.addFlashAttribute("msg",false);
        } else{
            session.setAttribute("member", member);
        }

        return "redirect:/";
    }
}
