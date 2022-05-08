package com.xpanxion.myapp.student25;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    String draw() {
        // String symbol = " ";
        // if index i is 1 & i is less or = to size the loop runs this will run depending
        // on the size parameter
        for (int i = 1; i <= size; i++) {  // start with 1 since we are counting the # inside the parameters of square
            for (int j = 0; j < size; j++) { // this is the loop that organizes the *
                if (i == 1 || i == size || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else System.out.print(" ");

            }
            System.out.print("\n");
        }
        return "Square";
    }
}
