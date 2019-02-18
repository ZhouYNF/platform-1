package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeAreaMapper;
import com.nf147.platform.entity.GeArea;
import com.nf147.platform.service.GeAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GeAreaServiceImpl implements GeAreaService{

    @Autowired
    private GeAreaMapper geAreaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(GeArea record) {
        return 0;
    }

    @Override
    public GeArea selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<GeArea> selectAll() {
        return geAreaMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GeArea record) {
        return 0;
    }
}
