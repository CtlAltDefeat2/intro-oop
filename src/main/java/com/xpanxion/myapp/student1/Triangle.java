package com.xpanxion.myapp.student1;

public class Triangle extends Shape {
    private int length;

    public Triangle (int length) {
        this.length = length;
    }

    @Override
    String draw() {
        String triangleString = "";
        for (int i = 1; i <= length; i++) {
            for (int j = i; j < length; j++) {
                triangleString += " ";
            }
            for (int k = 1; k <= (2*i - 1); k++) {
                if(k == 1 || k == (2*i - 1) || i == length) {
                    triangleString += "*";
                } else {
                triangleString += " ";
            }
            }
        triangleString += "\n";
    }
    return triangleString;
    }
    }