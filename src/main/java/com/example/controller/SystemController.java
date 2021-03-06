package com.example.controller;

import com.example.requestModel.DSystemRequestModel;
import com.example.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by huc on 2017/5/25.
 * 系统参数
 */
@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    @RequestMapping("/system_list")
    public Map<String,Object> systemList(DSystemRequestModel system){
        Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
        resultMap.putAll(systemService.systemList(system));
        return resultMap;
    }
}
