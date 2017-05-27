package com.example.controller;

import com.example.requestModel.UserRequestModel;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by huc on 2017/5/27.
 * 用户信息
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Map<String,Object> login(UserRequestModel requestModel){
        Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
        resultMap.putAll(userService.userInfoByUserName(requestModel));
        return resultMap;
    }
}
