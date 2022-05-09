package com.xpanxion.myapp.student26;

public class Rectangle extends Shape {

    private final int width;
    private final int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    String draw() {
        String retval = "";
        if (width == 1 && height == 1) {
            retval = "*";
        } else {
            retval += ("*".repeat(width) + "\n"); // Draw top
            for (int i = 0; i < height - 2; i++) { // Draw body
                retval += ("*" + " ".repeat(width - 2) + "*\n");
            }
            retval += ("*".repeat(width) + "\n"); // Draw bottom
        }
        return retval;
    }

}
