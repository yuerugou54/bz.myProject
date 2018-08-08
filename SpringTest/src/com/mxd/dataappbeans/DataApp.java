package com.mxd.dataappbeans;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :约会吗
 */
public class DataApp {
    String depositon;//聚会地址

    public String getDepositon() {
        return depositon;
    }

    public void setDepositon(String depositon) {
        this.depositon = depositon;
    }

    public void askDataApp() {
        System.out.println(String.format("我们在%s聚会", depositon));
    }


}
