package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.enums.TypeEnum;
import com.example.model.User;
import com.example.requestModel.UserRequestModel;
import com.example.service.UserService;
import com.example.utils.DesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by huc on 2017/5/27.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String,Object> userInfoByUserName(UserRequestModel requestModel) {
        Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
        User user = userMapper.userInfoByUserName(requestModel.getUsername());
        //判断用户密码是否正确
        String DESKey = TypeEnum.DESKey.NAME; // 字节数必须是8的倍数
        if(requestModel.getPassword()!=null){
            String password = DesUtils.encrypt(requestModel.getPassword(),DESKey);
            System.out.println("加密后的密码："+password);
            if(password.equals(user.getPassword())){
                System.out.println("登陆成功！");
            }else {
                System.out.println("登录失败");
            }
        }
        resultMap.put("user",user);
        return resultMap;
    }
}
