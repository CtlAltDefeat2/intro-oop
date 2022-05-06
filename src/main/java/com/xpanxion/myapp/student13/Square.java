package com.xpanxion.myapp.student13;

public class Square extends Shape {

    // Data Members

    private int size;

    // Constructors

    Square() {
    }

    Square(int size) {
        this.size = size;
    }

    // Methods

    @Override
    String draw() {
        String result = "";
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

}
