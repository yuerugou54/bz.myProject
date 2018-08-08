package com.mxd.filtermode.demo;

import com.mxd.filtermode.client.Client;
import com.mxd.filtermode.entityfilter.AuthenticationFilter;
import com.mxd.filtermode.entityfilter.DebugFilter;
import com.mxd.filtermode.filtermanager.FilterManager;
import com.mxd.filtermode.target.Target;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :程序入口，http://www.runoob.com/design-pattern/intercepting-filter-pattern.html
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        //将需要用到的拦截链进行组装
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("我的执行请求");
    }
}
