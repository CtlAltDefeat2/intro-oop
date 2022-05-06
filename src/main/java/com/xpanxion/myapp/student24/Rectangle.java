package com.xpanxion.myapp.student24;

public class Rectangle extends Shape {
    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    String draw() {
        String star = "";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == height - 1) {
                    star += "*";
                } else {
                    star += " ";
                }
            }
            star += "\n";
        }
        return star;
    }
}
