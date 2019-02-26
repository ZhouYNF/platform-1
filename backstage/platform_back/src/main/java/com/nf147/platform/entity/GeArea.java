package com.nf147.platform.entity;

public class GeArea {
    private Integer id;

    private String areaName;

    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public GeArea() {
    }

    public GeArea(Integer id, String areaName, Integer parentId) {
        this.id = id;
        this.areaName = areaName;
        this.parentId = parentId;
    }
}