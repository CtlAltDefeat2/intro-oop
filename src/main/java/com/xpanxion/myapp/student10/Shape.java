package com.xpanxion.myapp.student10;

import java.util.ArrayList;

public abstract class Shape {
    public ArrayList<Shape> shapes = new ArrayList<>();

    abstract String draw();
    abstract Shape add(Shape shapes);
}
