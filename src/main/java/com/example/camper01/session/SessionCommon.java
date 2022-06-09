package com.example.camper01.session;

import com.example.camper01.domain.UserVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface SessionCommon {
    String MEMBERKEY = "member";

    public static UserVO getMember(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserVO vo = (UserVO) session.getAttribute(MEMBERKEY);
        return vo;
    }
}
