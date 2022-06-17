package com.example.camper01.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserVO {
    private String email;
    private String pw;
    private String nickname;
    private short age;
    private char sex;
    private Timestamp joindt;
}
