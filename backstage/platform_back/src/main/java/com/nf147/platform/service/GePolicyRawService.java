package com.nf147.platform.service;

import com.nf147.platform.entity.GePolicyRaw;

import java.util.List;

public interface GePolicyRawService {
    int deleteByPrimaryKey(Integer id);

    int insert(GePolicyRaw record);


    List<GePolicyRaw> selectAll();

    int updateByPrimaryKey(GePolicyRaw record);

    /**
     * @param start  页数
     * @param number 条数
     * @author 张东明
     * @date 2019/2/20
     * @info 根据页码查询原始政策信息
     */
    List<GePolicyRaw> selectByRamPager(Integer start, Integer number);

    /**
     * @param status  状态
     * @author 张东明
     * @date 2019/2/20
     * @info 修改原始政策表状态
     */
    int updateByRamStatus(Integer status);
}