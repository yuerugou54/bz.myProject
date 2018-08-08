package proxy;

/**
 * Project:Test0719
 * Author :maxiaodong
 * Time   :2018/07/25
 * Desc   :静态代理
 */
public class StaticProxy {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();

    }
}

//委托对象和代理对象都共同实现的接口
interface Subject {
    void request();//委托对象与代理对象都要共同实现的方法
}

class RealSubject implements Subject {

    @Override
    public void request() {
        System.err.println("subject request");
    }
}

class ProxySubject implements Subject {
    //开始与委托类耦合，需要在构造函数的参数中传入共同接口subject,
    // 其实直接传入Realsubject也可以，不过这样就强耦合了，属于hardcoding
    //因为客户端不需要了解你的详细细节，如果想要代理Realsubject_2，难带还要重写一个ProxySubject？
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.err.println("proxy request before");
        subject.request();
        System.err.println("proxy request after");
    }
}