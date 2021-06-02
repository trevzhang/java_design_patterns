package me.trevor.decorator2;

public class Application {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }
}
