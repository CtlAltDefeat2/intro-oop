package com.xpanxion.myapp.student9;

import org.w3c.dom.css.Rect;
public final class Rectangle extends Shape {
    // Create data members.
    private final int height;
    private final int width;

    // Generate constructors.
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;

    }

    @Override
    String draw() {
        String retval = "";
        if (width == 1 && height == 1) {
            retval = "*";
        } else {
            retval += ("*".repeat(width) + "\n"); // Draw top.
            for (int i = 0; i < height - 2; i++) { // Draw body.
                retval += ("*" + " ".repeat(width - 2) + "*\n");
            }
            return retval;
        }
        return retval;
    }
}



