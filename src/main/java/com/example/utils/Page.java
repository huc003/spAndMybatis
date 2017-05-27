package com.example.utils;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by huc on 2017/5/26.
 */
public class Page implements Serializable{
    protected int page = 1;// 当前页

    protected int rows = 10;//每页显示记录数

    protected String sort;// 排序字段

    protected String order;//排序 asc/desc

    protected int offset;//当前页数

    private int totalCount;//总记录数

    private int totalPage;//总页数

    public static Map<String, String> pageInfo(int currentPage,int pageSize,int totalRows){
        int totalPage = 1;
        if(totalRows>0){
            totalPage = (totalRows%pageSize==0)?(totalRows/pageSize):((totalRows/pageSize)+1);
        }
        if(currentPage>totalPage){
            currentPage = totalPage;
        }
        Map<String, String> result = new LinkedHashMap<String, String>();
        result.put("totalCount", totalRows+"");
        result.put("totalPage", totalPage+"");
        result.put("rows", pageSize+"");
        result.put("page", currentPage+"");
        return result;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getOffset() {
        return (page - 1) * rows;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        if (rows == 0) {
            return 0;
        }
        return totalCount % rows == 0 ? totalCount / rows : ((totalCount / rows) + 1);
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
