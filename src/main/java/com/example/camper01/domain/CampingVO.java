package com.example.camper01.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CampingVO {
    private long camNum;
    private String camName;
    private String camAddr;
    private String camCtg;
    private String camCheckInTime;
    private String camCheckOutTime;
    private Timestamp camTime;
    private String camLat;
    private String camLmg;

    private long adNum; //admin FK
}
