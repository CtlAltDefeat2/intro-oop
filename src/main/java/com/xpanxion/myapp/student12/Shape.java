package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public abstract class Shape { //abstracts prevents instantiation
    //
    //Data members
    //
    public ArrayList<Shape> shapes = new ArrayList();
    abstract String draw();
    public ArrayList lengthList = new ArrayList();
    public ArrayList widthList = new ArrayList();


    //
    //Constructors
    //

    //
    //Method
    //
   abstract Shape add(Shape shape);

    public void test(){
        System.out.println("test");
    }

}
