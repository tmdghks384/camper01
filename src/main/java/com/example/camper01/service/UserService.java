package com.example.camper01.service;

import com.example.camper01.domain.UserVO;
import com.example.camper01.mapper.UserMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Setter(onMethod_ = @Autowired)

    private UserMapper mapper;

    public boolean insertUser(UserVO vo) {
        return mapper.insertUser(vo) == 1;
    }

    public boolean updateUser(UserVO vo) {
        return mapper.updateUser(vo) == 1;
    }

    public boolean deleteUser(Long userNum) {
        return mapper.deleteUser(userNum) == 1;
    }

    public UserVO readUser(Long userNum) {
        return mapper.readUser(userNum);
    }
}
