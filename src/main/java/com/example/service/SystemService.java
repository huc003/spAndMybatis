package com.example.service;

import com.example.requestModel.DSystemRequestModel;

import java.util.Map;

/**
 * Created by huc on 2017/5/25.
 */
public interface SystemService {
    public Map<String,Object> systemList(DSystemRequestModel system);
}
