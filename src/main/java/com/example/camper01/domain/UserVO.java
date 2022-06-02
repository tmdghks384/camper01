package com.example.camper01.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserVO {
    private long userNum;
    private String userId;
    private String userPw;
    private String userEmail;
    private String userPhone;
    private Timestamp userBirth;
    private String userAddr;
    private Timestamp regDate;
}
