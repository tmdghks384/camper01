package com.example.camper01.service;

import com.example.camper01.domain.ReservationVO;
import com.example.camper01.mapper.ReservationMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Setter(onMethod_ = @Autowired)
    private ReservationMapper mapper;

    public boolean insertRv(ReservationVO vo) {
        return mapper.insertRv(vo) == 1;
    }

    public boolean updateRv(ReservationVO vo) {
        return mapper.updateRv(vo) == 1;
    }

    public boolean deleteRv(Long resNum) {
        return mapper.deleteRv(resNum) == 1;
    }

    public ReservationVO readRv(Long resNum) {
        return mapper.readRv(resNum);
    }

    public ReservationVO listMyRv(Long resNum, Long userNum) {
        return mapper.listMyRv(resNum, userNum);
    }
}
