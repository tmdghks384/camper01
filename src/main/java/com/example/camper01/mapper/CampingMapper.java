package com.example.camper01.mapper;

import com.example.camper01.domain.CampingVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CampingMapper {
    public int insertCamping(CampingVO vo);

    public int updateCamping(CampingVO vo);

    public int deleteCamping(Long camNum);

    public CampingVO readDetailCapming(Long camNum);

    public CampingVO readCamping(CampingVO vo);



}
