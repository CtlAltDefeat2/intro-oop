package com.xpanxion.myapp.student19;

public class Rectangle extends Shape {
    // Data members
    private int width;
    private int length;

    //Constructor

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
       for (int i = 0; i < width; i++) {
           System.out.print("*");
        }

       System.out.print('\n' + "*");

        for (int i = 1; i < (width - 1); i++) {
            System.out.print(" ");
        }

        System.out.print("*" + '\n');

        for (int i = 0; i < width; i++) {
            System.out.print("*");}

        System.out.println(" ");
            return;
        }


}