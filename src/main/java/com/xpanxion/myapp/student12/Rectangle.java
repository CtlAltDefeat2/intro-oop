package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public class Rectangle extends Shape {
    private int length;
    private int width;

    //
    //Constructors
    //
    Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }

    //
    //Overrides
    //
    @Override
    String draw() {
        int i = 0;
        int j = 0;
        String result = "";
        for (i = 1; i <= length; i++) {
            for (j = 0; j < width; j++) {
                if (i == 1 || i == length || j == 0 || j == width - 1) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }


    @Override
    Shape add(Shape rectangle) {
        this.shapes.add(rectangle);
        return rectangle;
    }
    //
    //Methods
    //
}
