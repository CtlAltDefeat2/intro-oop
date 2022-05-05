package com.xpanxion.myapp.student5;

public class Square extends Shape {
    // Variable Declarations
    private int size;
    // Constructors
    public Square (int size) {
        this.size = size;
    }
    @Override
    String draw() {
        return "*  *  *\n*     *\n*  *  *\n";
    }
}
