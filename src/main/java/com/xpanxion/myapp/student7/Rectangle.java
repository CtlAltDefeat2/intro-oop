package com.xpanxion.myapp.student7;

public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    @Override
    String draw() {
        String rectStar ="";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if(i== 0 || i == length-1 || j == 0 || j == width-1)
                    rectStar += "*";
                else
                    rectStar += " ";
            }
            rectStar += "\n";
        }
        return rectStar;
    }
}
