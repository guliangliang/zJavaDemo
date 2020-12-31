package model.design.singleton;

/**
 * 懒汉式
 * @author liang.gu
 * @date 2020/12/30
 */
public class Test02 {
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}

//饿汉式
class Singleton1{

    //1 构造器私有化
    private Singleton1(){

    }

    private static Singleton1 instance;

    public static Singleton1 getInstance(){
        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
//线程安全，但是效率太低
//    public synchronized static Singleton1 getInstance(){
//        if(instance == null) {
//            instance = new Singleton1();
//        }
//        return instance;
//    }

    //线程不安全，没有意义；只要进入if判断中，就会执行创建，没有意义
//    public static Singleton1 getInstance(){
//        if(instance == null) {
//            synchronized(Singleton1.class) {
//                instance = new Singleton1();
//            }
//        }
//        return instance;
//    }

}
