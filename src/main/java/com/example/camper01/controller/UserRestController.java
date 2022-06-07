package com.example.camper01.controller;

import com.example.camper01.domain.UserVO;
import com.example.camper01.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user/rest/*")
@RequiredArgsConstructor
@Log4j2
public class UserRestController {
    private final UserService user;

    @PostMapping("/join")
    public ResponseEntity<String> insertUser(@RequestBody UserVO userVO, HttpServletRequest request) {
        boolean isInserted = user.insertUser(userVO);
        try {
            if (isInserted == true) {
                log.info("회원가입 성공");
            }
        } catch (DataAccessException e) {
            log.warn("데이터 처리 실패");
        } catch (Exception e) {
            log.warn("시스템 에러");
        }
        return new ResponseEntity<>("회원가입이 완료되었습니다.", HttpStatus.OK);
    }
}
