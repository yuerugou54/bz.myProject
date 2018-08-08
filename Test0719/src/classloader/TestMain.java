package classloader;

import static java.lang.System.out;

/**
 * Project:Test0719
 * Author :maxiaodong
 * Time   :2018/07/19
 * Desc   :测试父类加载器的继承关系
 */
public class TestMain {
    public static void main(String[] args) {
        testClassLoaderExtendRelation();
    }

    /**
     * 测试应用类加载器【AppClassLoader】与扩展类加载器【extClassLoader】
     */
    public static void testClassLoaderExtendRelation() {
        ClassLoader loader = Test.class.getClassLoader();
        while (loader != null) {
            out.println(loader);
            loader = loader.getParent();
        }
    }
}


class Test {

}
