package com.xpanxion.myapp.student1;

public class Square extends Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    String draw () {
        String star = "";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == length - 1) {
                    star += "*";
                } else {
                    star += " ";
                }
            }
            star += "\n";
        }
        return star;
    }
}
