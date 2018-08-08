package com.mxd.annoations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Project:SpringTest
 * Author :maxiaodong
 * Time   :2018/07/31
 * Desc   :测试注解
 */
@name(name = "class111")
public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        name aa=Test.class.getDeclaredAnnotation(name.class);
        Method[] methods=test.getClass().getDeclaredMethods();
        for (Method method:methods) {
            Annotation[] annas=method.getAnnotations();
            for (Annotation anna:annas){
                System.out.println(anna);
            }
        }

        System.out.println(aa.name());

    }

    @name(name = "method111")
    public void ceshi(String aa) {

    }
}
