package com.xpanxion.myapp.student3;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(){};
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    String draw(){
        return "rectangle";
    }

}

