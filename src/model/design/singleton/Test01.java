package model.design.singleton;

/**
 * 饿汉式
 * @author liang.gu
 * @date 2020/12/30
 */
public class Test01 {
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
//饿汉式
class Singleton{

    //1 构造器私有化
    private Singleton(){

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
