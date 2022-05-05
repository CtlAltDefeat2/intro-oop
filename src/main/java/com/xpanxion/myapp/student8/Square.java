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
                if ((j > 0 && j < width-1) && (i > 0 && i < width - 1)) {
                    row += " ";
                } else {
                    row += "*";
                }
            }
            System.out.println(row);
        }
        return "";
    }

}
