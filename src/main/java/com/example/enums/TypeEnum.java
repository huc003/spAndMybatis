package com.example.enums;

/**
 * Created by huc on 2017/5/27.
 */
public enum TypeEnum{


    DESKey("des_key","a2A\\!@\\#$%1");

    public String CODE = "" ;
    public String NAME = "" ;

    TypeEnum(String code,String name){
        this.CODE = code;
        this.NAME = name ;
    }
}