package com.xpanxion.myapp.student12;

public class Rectangle extends Shape{
    private int length;
    private int width;

    //
    //Constructors
    //
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    //
    //Overrides
    //
    @Override
    String draw(){
        return ("Draw rectangle");
    }

    @Override
    Shape add(Shape rectangle){
        this.shapes.add(rectangle);
        return rectangle;
    }
    //
    //Methods
    //
}
