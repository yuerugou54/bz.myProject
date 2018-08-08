package com.mxd.sayhellobeans;

import com.mxd.dataappbeans.DataApp;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :这是一个测试类helloworldS
 */
public class SayHello {
    String name;
    int age;
    AskStatus askStatus;
    DataApp dataApp;

    public DataApp getDataApp() {
        return dataApp;
    }

    public void setDataApp(DataApp dataApp) {
        this.dataApp = dataApp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void printHello(String flag) {
        System.out.println(String.format("你好:%s,你今年：%d岁了", name, age) + flag);
        System.out.println(askStatus.askHealth());
        dataApp.askDataApp();
    }

    private SayHello(AskStatus askStatus) {
        this.askStatus = askStatus;
    }

    public void hashCodeDataApp() {
        System.out.println("DataApp hash:" + dataApp.hashCode());
    }
}
