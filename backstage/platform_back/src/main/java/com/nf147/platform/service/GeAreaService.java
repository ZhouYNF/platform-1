package com.nf147.platform.service;

import com.nf147.platform.entity.GeArea;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GeAreaService {
    int deleteByPrimaryKey(Integer id);

    int insert(GeArea record);

    GeArea selectByPrimaryKey(Integer id);

    List<GeArea> selectAll();

    int updateByPrimaryKey(GeArea record);
}