package com.nf147.platform.dao;

import com.nf147.platform.entity.GePolicyRaw;
import java.util.List;

public interface GePolicyRawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyRaw record);


    List<GePolicyRaw> selectAll();

    int updateByPrimaryKey(GePolicyRaw record);
}