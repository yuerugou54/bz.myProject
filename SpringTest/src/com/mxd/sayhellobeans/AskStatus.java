package com.mxd.sayhellobeans;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :这是在询问近期状态
 */

public class AskStatus {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String askHealth() {
        return String.format("%s身体怎么样？还好吗", name);
    }
}
