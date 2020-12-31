package model.builder;

/**
 *
 * @author liang.gu
 * @date 2020/12/31
 */
public class HighBuilding extends HourseBuilder{


    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");
    }
}
