package model.prototype.improve;

/**
 * @author liang.gu
 * @date 2020/12/30
 */
public class SheepClient {
    //深拷贝实现方式： 重写clone方法 、对象序列化
    public static void main(String[] args) {
        //普通对象赋值
        Sheep sheep1 = new Sheep("shee1",12);
        sheep1.setFriends(new Sheep("friends",22));
//        Sheep sheep2 = new Sheep(sheep1.getName(),sheep1.getAge());
//        Sheep sheep3 = new Sheep(sheep1.getName(),sheep1.getAge());
       try {
            Sheep sheep2 = (Sheep) sheep1.clone();
            Sheep sheep3 = (Sheep) sheep1.clone();

           System.out.println(sheep2.getFriends());
           System.out.println(sheep3.getFriends());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
