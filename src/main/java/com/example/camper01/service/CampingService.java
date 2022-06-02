package com.example.camper01.service;

import com.example.camper01.domain.CampingVO;
import com.example.camper01.mapper.CampingMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampingService {
    @Setter(onMethod_ = @Autowired)

    private CampingMapper mapper;

    public boolean insertCamping(CampingVO vo) {
        return mapper.insertCamping(vo) == 1;
    }

    public boolean updateCamping(CampingVO vo) {
        return mapper.updateCamping(vo) == 1;
    }

    public boolean deleteCamping(Long camNum) {
        return mapper.deleteCamping(camNum) == 1;
    }
}
