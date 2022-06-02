package com.example.camper01.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ReplyVO {
    private long repNum;
    private String repCont;
    private Timestamp regDate;

    private long userNum; //user FK
    private long bdNum; //board FK
}
