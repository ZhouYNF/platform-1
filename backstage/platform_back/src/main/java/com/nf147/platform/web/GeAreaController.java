package com.nf147.platform.web;

import com.nf147.platform.dao.GeAreaMapper;
import com.nf147.platform.entity.GeArea;
import com.nf147.platform.service.GeAreaService;
import com.nf147.platform.service.impl.GeAreaServiceImpl;
import com.nf147.platform.toolClass.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeAreaController {

    @Autowired
    private GeAreaServiceImpl geAreaService;

    @RequestMapping(value = "/getArea", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    List<GeArea> selectAreaAll(){
       return geAreaService.selectAll();
    }
}
