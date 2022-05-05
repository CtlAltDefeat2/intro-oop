package com.xpanxion.myapp.student2;

public class Rectangle extends Shape{

    private final int length;
    private final int width;
    private String rectPic="";

    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    String draw() {
        for (int i = 0; i < length; i++) {
            if (i == 0 || i == length - 1) {
                //for first line and last line , print the full line
                for (int j = 0; j < width; j++) {
                    rectPic+=("* ");
                }
                rectPic+=("\n"); //enter a new line
            } else {
                //else
                for (int j = 0; j < width; j++) {
                    if (j == 0 || j == width - 1) {
                        //print only the first and last element as the character
                        rectPic+=("* ");
                    } else {
                        //else print only blank space for the inner elements
                        rectPic+=(" "+" ");
                    }
                }
                rectPic+=("\n"); //enter a new line
            }
        }
        return rectPic;

    }
}
