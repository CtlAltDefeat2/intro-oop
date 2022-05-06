package com.xpanxion.myapp.student16;

public class Square extends Shape {
    //
    //Data members
    //
    private int length;
    //
    //Constructors
    //
    public Square(int size) {
        this.length = size;
    }
    //
    //Overrides
    //
    @Override
    public String draw() {
        String squareStar = "";
        for (int i = 0; i < length; i++){
            for (int p = 0; p < length; p++){
                if(i == 0 || i == length -1|| p == 0 || p == length - 1)
                    squareStar += "*";
                else
                    squareStar += " ";
            }
            squareStar += "\n";
        }
        return squareStar;
    }
}
