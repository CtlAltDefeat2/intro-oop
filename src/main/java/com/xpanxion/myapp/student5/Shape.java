package com.xpanxion.myapp.student5;

import java.util.ArrayList;

public abstract class Shape {
    // Variable Declarations
    public ArrayList<Shape> shapes = new ArrayList();
    // Methods
    abstract String draw();
    abstract Shape add(Shape shapes);
}