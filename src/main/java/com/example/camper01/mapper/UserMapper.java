package com.example.camper01.mapper;

import com.example.camper01.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int insertUser(UserVO vo);

    public int updateUser(UserVO vo);

    public int deleteUser(Long userNum);

    public UserVO readUser(Long userNum);
}
