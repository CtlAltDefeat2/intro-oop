package com.xpanxion.myapp.student13;

public class Rectangle extends Shape {

    // Data Members

    private int width;
    private int length;

    // Constructors

    Rectangle(){
    }
    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    String draw() {
        String result = "";
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == length || j == 1 || j == width) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

}


