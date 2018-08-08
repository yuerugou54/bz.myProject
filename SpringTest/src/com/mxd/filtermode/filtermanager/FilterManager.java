package com.mxd.filtermode.filtermanager;

import com.mxd.filtermode.Filter;
import com.mxd.filtermode.filterchain.FilterChain;
import com.mxd.filtermode.target.Target;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :拦截管理器，管理过滤器与过滤器拦截链
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        //拦截完之后，总是要发送给处理程序的，所以需要setTarget
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }


}
