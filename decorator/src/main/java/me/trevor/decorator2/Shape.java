package me.trevor.decorator2;

/**
 * 形状类：该类为一个抽象类，主要提供画形状的方法
 */
public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
