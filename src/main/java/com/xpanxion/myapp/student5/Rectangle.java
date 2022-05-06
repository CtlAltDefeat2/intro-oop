package com.xpanxion.myapp.student5;

public class Rectangle extends Shape {
    // Variable Declarations
    private int length;
    private int width;
    // Constructors
    Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }
    // Overrides
    @Override
    String draw() {
        String result = "";
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 1 || i == length || j == 0 || j == width - 1) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        } return result;
    }
    @Override
    Shape add(Shape rectangle) {
        this.shapes.add(rectangle);
        return rectangle;
    }
}
