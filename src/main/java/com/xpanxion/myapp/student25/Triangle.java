package com.xpanxion.myapp.student25;

public class Triangle extends Shape {
    private int rows;


    public Triangle(int rows) {
        this.rows = rows;


    }

    @Override
    String draw() {
        for (int i = 1; i <= rows; i++) { //Outer loop work for rows
            for (int j = i; j < rows; j++) { //inner loop work for space
                System.out.print(" "); //prints space between two stars
            }
            for (int l = 1; l <=(2 * i - 1) ; l++) { //inner loop for columns
                if ( l == 1 || i == rows || l == (2 * i - 1)) { // conditions to print stars
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
            }
            return "Triangle";
        }
    }



