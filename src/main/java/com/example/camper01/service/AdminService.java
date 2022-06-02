package com.example.camper01.service;

import com.example.camper01.domain.AdminVO;
import com.example.camper01.mapper.AdminMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Setter(onMethod_ = @Autowired)

    private AdminMapper mapper;

    public boolean insertAdmin(AdminVO vo) {
        return mapper.insertAdmin(vo) == 1;
    }

    public boolean updateAdmin(AdminVO vo) {
        return mapper.updateAdmin(vo) == 1;
    }

    public boolean deleteAdmin(Long adNum) {
        return mapper.deleteAdmin(adNum) == 1;
    }

    public AdminVO readAdmin(Long adNum) {
        return mapper.readAdmin(adNum);
    }

}
