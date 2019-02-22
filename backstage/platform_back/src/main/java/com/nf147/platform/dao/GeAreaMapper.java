package com.nf147.platform.dao;

import com.nf147.platform.entity.GeArea;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GeAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GeArea record);

    GeArea selectByPrimaryKey(Integer id);

    List<GeArea> selectAll();

    int updateByPrimaryKey(GeArea record);
}