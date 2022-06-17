package com.example.camper01.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardVO {
    private long bdNum;
    private String bdTitle;
    private String bdCont;
    private Timestamp regDate;
    private Timestamp modDate;

    private String email;
}
