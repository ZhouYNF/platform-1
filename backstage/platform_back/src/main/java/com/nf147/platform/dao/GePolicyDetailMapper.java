package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicyDetail;
import java.util.List;

public interface GePolicyDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyDetail record);

    GePolicyDetail selectByPrimaryKey(Integer id);

    List<GePolicyDetail> selectAll();

    int updateByPrimaryKey(GePolicyDetail record);
}