package com.xpanxion.myapp.student7;

public class Square extends Shape{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    String draw() {
        return "Draw Square";
    }
}
