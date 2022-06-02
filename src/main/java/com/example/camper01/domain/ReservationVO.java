package com.example.camper01.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ReservationVO {
    private long resNum;
    private Timestamp resDate;
    private String resRequest;

    private long camNum; //camping FK
    private long userNum; //user FK
    private long adNum; //admin FK
}
