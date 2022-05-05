package com.xpanxion.myapp.student8;

public class Rectangle extends Shape {

    int height;
    int width;
    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }


    public String draw() {
        for(int i = 0; i < height; i++) {
            String row = "";
            for(int j = 0; j < width; j++) {
                row += "*";
            }
            System.out.println(row);
        }
        return "";
    }

}
