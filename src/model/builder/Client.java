package model.builder;

/**
 * @author liang.gu
 * @date 2020/12/31
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHourse commonHourse = new CommonHourse();
        //准备创建房子的指挥者
        HourseDirector hourseDirector = new HourseDirector(commonHourse);
        //完成盖房子，返回产品
        Hourse hourse = hourseDirector.construcHouse();

        hourseDirector.setHourseBuilder(new HighBuilding());
        Hourse hourse1 = hourseDirector.construcHouse();


    }
}
