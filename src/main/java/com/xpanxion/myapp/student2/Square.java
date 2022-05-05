package com.xpanxion.myapp.student2;

public class Square extends Shape {
    private int size;
    private String squarPic="";
    public Square(int size) {
        super();
        this.size=size;
    }

    @Override
    String draw() {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    squarPic+=("* ");
                }
                squarPic+=("\n");
            } else {
                for (int j = 0; j < size; j++) {
                    if (j == 0 || j == size - 1) {
                        squarPic+=("* ");
                    } else {
                        squarPic+=(" " + " ");
                    }
                }
                squarPic+=("\n");
            }
        }
        return squarPic;
    }

}
