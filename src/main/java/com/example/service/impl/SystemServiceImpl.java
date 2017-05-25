package com.example.service.impl;

import com.example.dao.SystemMapper;
import com.example.service.SystemService;
import com.example.model.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * Created by huc on 2017/5/25.
 */
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private SystemMapper systemMapper;

    @Override
    public List<System> systemList() {
        return systemMapper.list();
    }
}
