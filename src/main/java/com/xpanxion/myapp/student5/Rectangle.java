package com.xpanxion.myapp.student5;

public class Rectangle extends Shape {
    // Variable Declarations
    private int length;
    private int width;
    // Constructors
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    String draw() {
        return "**********\n*        *\n**********";
    }
}
