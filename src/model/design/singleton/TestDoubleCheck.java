package model.design.singleton;

/**
 * 双重检查机制，最优解
 * @author liang.gu
 * @date 2020/12/30
 */
public class TestDoubleCheck {
    public static void main(String[] args) {
        Singleton2.getInstance();
    }
}

//饿汉式
class Singleton2{

    //1 构造器私有化
    private Singleton2(){

    }

    private volatile static Singleton2 instance;

    public static Singleton2 getInstance(){
        if(instance == null) {
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }


}
