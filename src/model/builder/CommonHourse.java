package model.builder;

/**
 *
 * @author liang.gu
 * @date 2020/12/31
 */
public class CommonHourse extends HourseBuilder{


    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
