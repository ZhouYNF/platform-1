package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GeAreaMapper;
import com.nf147.platform.dao.GePolicyDetailMapper;
import com.nf147.platform.entity.GeArea;
import com.nf147.platform.entity.GePolicyDetail;
import com.nf147.platform.service.GeAreaService;
import com.nf147.platform.service.GePolicyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GePolicyDetailServiceImpl implements GePolicyDetailService{

    @Autowired
    private GePolicyDetailMapper gePolicyDetailMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(GePolicyDetail record) {
        return 0;
    }

    @Override
    public GePolicyDetail selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<GePolicyDetail> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(GePolicyDetail record) {
        return 0;
    }

    @Override
    public List<GePolicyDetail> selectByPolicDetail(Integer start, Integer number) {
        return null;
    }
}
