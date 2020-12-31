package model.design.singleton;

/**
 * 内部静态类解决，类的装载是线程安全的
 * @author liang.gu
 * @date 2020/12/30
 */
public class TestInnerClass {
    public static void main(String[] args) {
        Singleton3.getInstance();
    }
}

//
class Singleton3{

    //1 构造器私有化
    private Singleton3(){

    }

    /**
     * 1、静态内部类在Singleton3被装载时并不会立即实例化，而是在需要实例化时 调用getInstance方法，才会
     * 装载InnerClass类，从而完成Singleton的实例化
     * 2、类的静态属性只会在第一次加载类的时候初始化
     */
    private static class InnerClass{
        private static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return InnerClass.instance;
    }


}
