package com.example.service.impl;

import com.example.dao.SystemMapper;
import com.example.requestModel.DSystemRequestModel;
import com.example.service.SystemService;
import com.example.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by huc on 2017/5/25.
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemMapper systemMapper;

    @Override
    public Map<String,Object> systemList(DSystemRequestModel system) {
        Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
        //分页
        Map<String, String> pageInfo = Page.pageInfo(system.getPage(),system.getRows(),systemMapper.listCount());
        system.setPage(Integer.parseInt(pageInfo.get("page")+""));
        resultMap.put("page_info",pageInfo);
        resultMap.put("system_list",systemMapper.list(system));
        return resultMap;
    }
}
