package com.example.service;

import com.example.requestModel.UserRequestModel;

import java.util.Map;

/**
 * Created by huc on 2017/5/27.
 */
public interface UserService {
    public Map<String,Object> userInfoByUserName(UserRequestModel requestModel);
}
