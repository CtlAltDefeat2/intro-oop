package com.xpanxion.myapp.student11;

import java.util.ArrayList;

public abstract class Shape {

    abstract String draw();

    private ArrayList<Shape> shapes;

    public Shape() {
        this.shapes = new ArrayList<Shape>();
    }

}
