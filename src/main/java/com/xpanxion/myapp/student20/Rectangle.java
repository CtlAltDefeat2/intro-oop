package com.xpanxion.myapp.student20;

public class Rectangle extends Shape{
    //
    //Data Members
    //
    private int width;
    private int length;

    //
    //Constructors
    //
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    //
    //Overrides
    //
    @Override
    String draw() {
        return "Draw rectangle";
    }
}