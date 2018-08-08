package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.System.out;

/**
 * Project:Test0719
 * Author :maxiaodong
 * Time   :2018/07/25
 * Desc   :java动态代理之JDK
 */
public class JDKDynamicProxy {

    public static void main(String[] args) {

        //这是委托类
        RealSubject1 realSubject1 = new RealSubject1();

        //代理类要调用的处理器，也就是说，你在代理的时候要干什么，比如代理开始之前，之中，之后要干什么
        //这个ProxyHandler实现InvocationHandler接口，必须要实现invoke方法，这个方法中允许你在调用方法的时候执行一些自定义事件
        ProxyHandler handler = new ProxyHandler(realSubject1);

        //这里是在生成代理对象，通过接口接收返回的对象,通过Proxy生成代理类
        //第一个参数获得类加载器，第二个参数得到该类所实现的所有接口，第三个参数是自定义的处理器
        //通过一个类加载器与一个接口数组，确定了一个代理类
        Subject1 proxySubject = (Subject1) Proxy.newProxyInstance(RealSubject1.class.getClassLoader(),
                RealSubject1.class.getInterfaces(), handler);//动态生成代理对象

        proxySubject.request1("参数");
        proxySubject.request2();

        out.println(proxySubject.getClass());
        out.println(proxySubject.getClass().getClassLoader());
        out.println(proxySubject.getClass().getDeclaringClass());

    }
}

/**
 * 定义接口
 */
interface Subject1 extends Subject2{
    void request1(String arg);
}

interface Subject2 {
    void request2();
}

/**
 * 委托类
 */
class RealSubject1 implements Subject1 {

    @Override
    public void request1(String arg) {
        out.println("====RealSubject request1======"+arg);
    }

    @Override
    public void request2() {
        out.println("====RealSubject request2======");
    }
}

/**
 * 代理类调用处理器
 */
class ProxyHandler implements InvocationHandler {

    private Subject1 subject1;

    public ProxyHandler(Subject1 subject1) {
        this.subject1 = subject1;
    }

    /**
     *
     * @param proxy 代理对象，表示哪个代理对象调用了method方法
     * @param method 表示哪个方法被调用了
     * @param args 指定调用方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        out.println("=========before==========");
        Object result = method.invoke(subject1,args);
        out.println("=========after===========");
        return result;
    }
}
