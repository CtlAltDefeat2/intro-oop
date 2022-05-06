package com.xpanxion.myapp.student16;

public class Rectangle extends Shape {
    //
    //Data members
    //
    private int width;
    private int length;

    //
    //Constructors
    //
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    //
    //Method
    //
    private static void drawRectangle() { //area of a rectangle is length * width

    }

    //
    //Overrides
    //
    @Override
    public String draw() {
        String rectangleStar = "";
        //Why the for loop? the for loop keeps looping until it is false
        // the second for with and if/else statement draws the picture
        // then, because the first for loop needs a return, you would return rectangleStar,
        // so the return draws the shape
        for (int i = 0; i < length; i++) {// typical for loop beginning always used since day 1
            for (int p = 0; p < width; p++) { // need the width because it's a rectangle
                if (i == 0 || i == length - 1 || p == 0 || p == width - 1)
                    rectangleStar += "*";
                else
                    rectangleStar += " ";
            }
            rectangleStar += "\n";

        }
        return rectangleStar;
    }
}