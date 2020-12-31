package model.principle.ocp;

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
        if(a.m_type == 1){
            drawCircle(a);
        }
        else if(a.m_type == 2){
            drawRectangle(a);
        }
    }

    public void drawRectangle(Shape shape){
        System.out.println("矩形");
    }

    public void drawCircle(Shape shape){
        System.out.println("圆形");
    }
}
// shape基类
class Shape{
    int m_type;
}

class Circle extends Shape{
    Circle(){
        this.m_type = 1;
    }
}
class Rectangle extends Shape{
    Rectangle(){
        this.m_type = 2;
    }
}