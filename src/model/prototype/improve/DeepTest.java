package model.prototype.improve;

/**
 * @author liang.gu
 * @date 2020/12/30
 */
public class DeepTest {

    public static void main(String[] args) {
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget();
        deepCloneTarget.setCloneAge("12");
        deepCloneTarget.setCloneName("jack");
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setAge(100);
        deepProtoType.setName("9999");
        deepProtoType.deepCloneTarget = deepCloneTarget;

        try {
            DeepProtoType deepProtoType1 = (DeepProtoType)deepProtoType.clone();
            DeepProtoType deepProtoType2 = (DeepProtoType)deepProtoType.clone();
            System.out.println(deepProtoType1.deepCloneTarget == deepProtoType2.deepCloneTarget);

            DeepProtoType deepProtoType3 = (DeepProtoType)deepProtoType.deepClone();
            DeepProtoType deepProtoType4 = (DeepProtoType)deepProtoType.deepClone();
            System.out.println(deepProtoType1.deepCloneTarget  == deepProtoType2.deepCloneTarget);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
