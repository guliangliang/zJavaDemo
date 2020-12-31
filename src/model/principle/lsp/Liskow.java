package model.principle.lsp;

/**
 * @author liang.gu
 * @date 2020/12/29
 */
public class Liskow {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3=" + a.fuc1(11,3));
        B b = new B(); //B 无意中重写了A中的fun1方法，在按照1使用，违反了里氏替换原则
        System.out.println("11 - 3=" + b.fuc1(11,3));
        System.out.println("11 - 3 + 10=" + b.fuc2(11,3));
    }
}

class A{
    //返回两个数的差
    public int fuc1(int a,int b){
        return a - b;
    }
}

class B extends A{
    @Override
    public int fuc1(int a, int b) {
        return a + b;
    }

    public int fuc2(int a,int b){
        return fuc1(a,b) + 10;
    }
}