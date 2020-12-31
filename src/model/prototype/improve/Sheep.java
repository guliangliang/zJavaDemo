package model.prototype.improve;

/**
 * @author liang.gu
 * @date 2020/12/30
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    // 确实是 深copy 还是浅copy ;  直接clone是浅copy
    private Sheep friends;

    public Sheep(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 使用默认的clone方法来完成
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();

        return sheep;
    }

    public Sheep getFriends() {
        return friends;
    }

    public void setFriends(Sheep friends) {
        this.friends = friends;
    }
}
