package model.principle.dip;

/**
 * @author liang.gu
 * @date 2020/12/29
 */
public class Denpendence {

    public static void main(String[] args) {

    }
}
//依赖倒置原则  传递依赖关系有三种方式
//1 通过接口传递依赖
//interface IOpenAndClose{
//    public void open(ITV tv);
//}
//interface ITV{
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}


//2 通过构造方法传递依赖
//interface IOpenAndClose{
//    public void open();
//}
//interface ITV{
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{
//    /**
//     * 成员变量
//     */
//    ITV tv;
//
//    public OpenAndClose(ITV tv){
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        tv.play();
//    }
//}

//3 通过setter方法传递依赖
interface IOpenAndClose{
    public void open();
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    /**
     * 成员变量
     */
    ITV tv;

    @Override
    public void open() {
        tv.play();
    }

    public ITV getTv() {
        return tv;
    }

    public void setTv(ITV tv) {
        this.tv = tv;
    }
}
