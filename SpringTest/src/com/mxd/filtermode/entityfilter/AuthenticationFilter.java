package com.mxd.filtermode.entityfilter;

import com.mxd.filtermode.Filter;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :实体过滤器
 */
public class AuthenticationFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("AuthenticationFilter request:"+request);
    }
}
