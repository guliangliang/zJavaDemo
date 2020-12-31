package model.principle.ocp.improve;

/**
 * @author liang.gu
 * @date 2020/12/29
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        //如果在增加一个三角形，回增加哪些代码
    }
}

class GraphicEditor{
    //这是一个用于绘制图的使用方
    public void drawShape(Shape a){
        a.draw();
    }

}

// shape基类
abstract class Shape{
    int m_type;
    abstract void draw();
}

class Circle extends Shape{
    Circle(){
        this.m_type = 1;
    }

    @Override
    void draw() {
        System.out.println("圆形");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        this.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("矩形");
    }
}