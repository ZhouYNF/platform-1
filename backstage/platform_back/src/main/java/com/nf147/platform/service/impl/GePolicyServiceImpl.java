package com.nf147.platform.service.impl;

import com.nf147.platform.dao.GePolicyDetailMapper;
import com.nf147.platform.dao.GePolicyMapper;
import com.nf147.platform.entity.GePolicy;
import com.nf147.platform.entity.GePolicyDetail;
import com.nf147.platform.service.GePolicyDetailService;
import com.nf147.platform.service.GePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GePolicyServiceImpl implements GePolicyService {

    @Autowired
    private GePolicyMapper gePolicyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(GePolicy record) {
        return 0;
    }

    @Override
    public GePolicy selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<GePolicy> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(GePolicy record) {
        return 0;
    }
}
