package com.xpanxion.myapp.student3;

public class Square extends Shape{
    private int length;
    public Square(){};
    public Square(int length){
        this.length = length;
    }
    @Override
    String draw(){
        return "square";
    }

}
