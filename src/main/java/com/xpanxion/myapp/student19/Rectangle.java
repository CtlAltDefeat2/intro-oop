package com.xpanxion.myapp.student19;

public class Rectangle extends Shape {
    //Data members
   private int width;
    private int length;
    private String s =new String();
    //Constructor
  public Rectangle(int width, int length) {
      this.width = width;
       this.length = length;
    }
    @Override
    public String draw() {
        for (int i = 0; i < width; i++) {
            s = s + "*";
        }
        s = s+ '\n' + "*";
        for (int i = 1; i < (width - 1); i++) {
            s = s + " ";
        }
        s = s+ "*" + '\n';
        for (int i = 0; i < width; i++) {
            s = s + "*";
        }
        s= s+ (" ");
        return s;
    }
}