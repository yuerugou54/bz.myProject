package proxy;


import net.sf.cglib.proxy.Enhancer;

/**
 * Project:Test0719
 * Author :maxiaodong
 * Time   :2018/07/25
 * Desc   :CGLIB动态代理类
 */
public class CGLIBdynamicProxy {
    public static void main(String[] args) {
        RealSubject1 realSubject1=new RealSubject1();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(realSubject1.getClass());
        RealSubject1 realSubject2=(RealSubject1) enhancer.create();
        realSubject2.request2();

    }
}
