package com.xpanxion.myapp.student10;

public class Rectangle extends Shape{

    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    @Override
    String draw() {
        String result = " ";
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length || j == length || j == 0) {
                    result = "*";
                }
                else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

    @Override
    Shape add(Shape shapes) {
        return null;
    }
}
