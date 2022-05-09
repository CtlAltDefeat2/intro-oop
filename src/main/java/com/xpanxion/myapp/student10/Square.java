package com.xpanxion.myapp.student10;

import java.util.ArrayList;

public class Square extends Shape{
    private int size;
    private ArrayList<String> sizeList = new ArrayList<>();

    Square() {
        this.size = size;
        ArrayList<String> sizeList = new ArrayList<String> (size);
        this.sizeList = sizeList;
    }

    String draw() {
        String result = " ";
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size || j == 0 || j == size - 1) {
                    result += "*";
                }
                else {
                    result += "*";
                }
            }
        }
        return result;
    }

    @Override
    Shape add(Shape shapes) {
        return null;
    }

}
