package com.xpanxion.myapp.student19;

public class Square extends Shape {
    //Data members
    private int size;

    //Constructor
    public Square(int size) {
        this.size = size;
    }

    @Override
   public void draw() {

        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }

        System.out.print( '\n' + "*");

        for (int i = 1; i < (size - 1); i++) {
            System.out.print(" ");
        }

        System.out.print( "*" +'\n');

        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        return;
    }


}