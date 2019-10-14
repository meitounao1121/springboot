package com.zlt.controller;

import com.zlt.pojo.Boot;
import com.zlt.pojo.ClassEntity;
import com.zlt.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BootController {
    @Autowired
    private BootService bootService;

    @RequestMapping(value="bootShowAll")
    @ResponseBody
    public List<ClassEntity> showAll(){
        return bootService.showAll();
    }

}
