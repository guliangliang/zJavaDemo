package model.builder;

/**
 * 抽象的建造者
 * @author liang.gu
 * @date 2020/12/31
 */
public abstract class HourseBuilder {
    //产品组合
    protected Hourse hourse = new Hourse();

    //建造流程

    public abstract  void buildBasic();

    public abstract  void buildWalls();

    public abstract  void roofed();

    //建造好后，返回产品
    public Hourse buildHourse(){
        return hourse;
    }
}
