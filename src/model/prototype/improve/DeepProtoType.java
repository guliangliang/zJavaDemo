package model.prototype.improve;

import java.io.*;

/**
 * @author liang.gu
 * @date 2020/12/30
 */
public class DeepProtoType implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    DeepCloneTarget deepCloneTarget ;


    // 重写clone方法 深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepProtoType deepProtoType = (DeepProtoType) super.clone();
        deepProtoType.deepCloneTarget = (DeepCloneTarget)deepCloneTarget.clone();
        return deepProtoType;
    }
    // 对象序列化进行深拷贝
    public Object deepClone(){
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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
}
