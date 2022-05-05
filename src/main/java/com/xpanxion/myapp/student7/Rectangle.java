package com.xpanxion.myapp.student7;

public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    String draw() {
        return "draw Rectangle";
    }
}
