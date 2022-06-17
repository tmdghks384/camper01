package com.example.camper01.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Data
public class MemberVO {
    private String email;
    private String pw;
    private String nickname;
    private short age;
    private char sex;
    private Timestamp joindt;
}
