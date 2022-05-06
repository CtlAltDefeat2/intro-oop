package com.xpanxion.myapp.student19;

public class Square extends Shape {
    //Data members
    private int size;
    private String s = new String();
    //Constructor
    public Square(int size) {
        this.size = size;
    }
    @Override
   public String draw() {
        for (int i = 0; i < size; i++) {
           s = s + "*";
        }
        s = s + '\n' + "*";
        for (int i = 1; i < (size - 1); i++) {
            s = s + " ";
        }
        s = s + "*" +'\n';
        for (int i = 0; i < size; i++) {
            s = s + "*";
        }
        s = s + " ";
        return s;
    }
}