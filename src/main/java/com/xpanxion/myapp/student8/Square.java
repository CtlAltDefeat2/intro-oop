package com.xpanxion.myapp.student8;

public class Square extends Shape {

    int width;

    public Square(int width) {
        this.width = width;
    }


    public String draw() {
        for(int i = 0; i < width; i++) {
            String row = "";
            for(int j = 0; j < width; j++) {
                row += "*";
            }
            System.out.println(row);
        }
        return "";
    }

}
