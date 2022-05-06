package com.xpanxion.myapp.student14;

public class Rectangle extends Shape{
    //data members
    private int width;
    private int length;

    //constructors

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    //methods
    //overrides
    @Override
    String draw() {
        String star = "";
        for (int i = 0; i < length; i++){
            for (int j = 0; j < width; j++){
                if(i == 0 || i == length -1|| j == 0 || j == width - 1)
                    star += "*";
                else
                    star += " ";
            }
            star += "\n";
        }
        return star;
    }
}
