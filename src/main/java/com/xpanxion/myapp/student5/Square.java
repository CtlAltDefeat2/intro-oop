package com.xpanxion.myapp.student5;

import java.util.ArrayList;

public class Square extends Shape{
    // Variable Declarations
    private int size;
    private ArrayList<ArrayList<String>> sizeList = new ArrayList<>();
    // Constructors
    Square(int size){
        this.size = size;
        ArrayList sizeList = new ArrayList<String>(size);
        this.sizeList = sizeList;
    }
    // Overrides
    @Override
    String draw() {
        String result = "";
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 1 || i == size || j == 0 || j == size - 1) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        } return result;
    }
    @Override
    Shape add(Shape square){
        this.shapes.add(square);
        return square;
    }
}