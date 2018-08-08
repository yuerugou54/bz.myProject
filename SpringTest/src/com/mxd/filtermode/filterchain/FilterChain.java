package com.mxd.filtermode.filterchain;

import com.mxd.filtermode.Filter;
import com.mxd.filtermode.target.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :过滤器链
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);//发送给真正的执行者
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
