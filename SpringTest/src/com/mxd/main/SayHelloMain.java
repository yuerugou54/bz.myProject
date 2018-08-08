package com.mxd.main;

import com.mxd.dataappbeans.DataApp;
import com.mxd.sayhellobeans.SayHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/21
 * Desc   :SpringHelloMain
 */
public class SayHelloMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:/Projects/mxd/SpringTest/src/resource/spring-config.xml");
        SayHello sayHello = (SayHello) context.getBean("sayHello");
        sayHello.printHello("bean Test");
        sayHello.hashCodeDataApp();
        DataApp dataApp = (DataApp) context.getBean("dataApp");
        System.out.println("DataApp hash:" + dataApp.hashCode());
        DataApp dataApp1 = new DataApp();
        System.out.println("DataApp hash:" + dataApp1.hashCode());


    }
}
