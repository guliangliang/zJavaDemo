package model.principle.isp;

/**
 * @author liang.gu
 * @date 2020/12/29
 */
public class Segregation {


}

interface Student{
    void read();
    void read2();
    void read3();
    void read4();
    void read5();
    void read6();
}

class Jack implements Student{

    @Override
    public void read() {
        System.out.println("Jack 实现了read");
    }

    @Override
    public void read2() {
        System.out.println("Jack 实现了read2");
    }

    @Override
    public void read3() {
        System.out.println("Jack 实现了read3");
    }

    @Override
    public void read4() {
        System.out.println("Jack 实现了read4");
    }

    @Override
    public void read5() {
        System.out.println("Jack 实现了read5");
    }

    @Override
    public void read6() {
        System.out.println("Jack 实现了read6");
    }
}

class Friends{
    public void allRead(Student stu){
        stu.read();
    }

    public void allRead2(Student stu){
        stu.read2();
    }

    public void allRead3(Student stu){
        stu.read3();
    }
}