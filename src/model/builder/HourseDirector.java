package model.builder;

/**
 * 动态的指定制作流程
 * @author liang.gu
 * @date 2020/12/31
 */
public class HourseDirector {

    HourseBuilder hourseBuilder = null;

    //构造器 传入hourseBuilder
    public HourseDirector(HourseBuilder hourseBuilder){
        this.hourseBuilder = hourseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public Hourse construcHouse(){
        hourseBuilder.buildBasic();
        hourseBuilder.buildWalls();
        hourseBuilder.roofed();
        return hourseBuilder.buildHourse();
    }

    public HourseBuilder getHourseBuilder() {
        return hourseBuilder;
    }

    public void setHourseBuilder(HourseBuilder hourseBuilder) {
        this.hourseBuilder = hourseBuilder;
    }
}
