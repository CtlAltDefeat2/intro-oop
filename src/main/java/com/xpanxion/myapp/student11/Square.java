package com.xpanxion.myapp.student11;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        this.size = size;

    }

    @Override
    String draw() {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 1 || i == size || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.print("\n");
        }
        return "Square";
    }
}





