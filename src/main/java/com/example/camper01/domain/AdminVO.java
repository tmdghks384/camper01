package com.example.camper01.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class AdminVO {
    private long adNum;
    private String adId;
    private String adPw;
    private String adEmail;
    private String adPhone;
    private Timestamp adBirth;
    private String adAddr;
    private Timestamp regDate;
    private String adBussNum;
}
