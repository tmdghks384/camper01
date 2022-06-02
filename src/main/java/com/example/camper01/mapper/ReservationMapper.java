package com.example.camper01.mapper;

import com.example.camper01.domain.ReservationVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper {
    public int insertRv(ReservationVO vo);

    public int updateRv(ReservationVO vo);

    public int deleteRv(Long resNum);

    public ReservationVO readRv(Long resNum);

    public ReservationVO listMyRv(Long resNum, Long userNum);
}