package com.xpanxion.myapp.student25;

public class Rectangle extends Shape{
private int length;
private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    String draw()
    {
        for (int i = 1; i <= width; i++)
        {  // start with 1 since we are counting the # inside the parameters of rectangle
            for (int j = 0; j < length; j++)
            { // this is the loop that organizes the *
                if (i == 1 || i == width || j == 0 || j == length - 1)
                {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.print("\n");
        }
        return "Rectangle";
    }

    }

