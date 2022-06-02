package com.example.camper01.mapper;

import com.example.camper01.domain.AdminVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    public int insertAdmin(AdminVO vo);

    public int updateAdmin(AdminVO vo);

    public int deleteAdmin(Long adNum);

    public AdminVO readAdmin(Long adNum);
}
