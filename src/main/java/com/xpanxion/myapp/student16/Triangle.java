package com.xpanxion.myapp.student16;

public class Triangle extends Shape {
//Area of the triangle base * height / 2
    private int height;
    private int base;


    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }
    private static void drawTriangle() {

    }

    @Override
    public String toString() {
        String triangle = " ";
        for (int i = 0; i < base; i++) {
            for (int p = 0; p < height; p++) {
                if (i == 0 || i == base - 1 || p == 0 || p == height - 1 / 2)
                    triangle += " * ";
                else
                    triangle += " ";

            }
            return triangle;
        }// can't figure out why it keeps returning test?
        return triangle;
    }
    }

