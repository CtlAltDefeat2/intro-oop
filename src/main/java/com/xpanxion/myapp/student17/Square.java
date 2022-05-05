package com.xpanxion.myapp.student17;

public class Square extends Shape {
    //
    //Data memebers
    //
    private int size;

    //
    //Constructors
    //
    public Square(int size) {
        this.size = size;
    }
    //
    //Overrides
    //
    @Override
    String draw() {
        return "Draw square";
    }
}
