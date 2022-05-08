package com.xpanxion.myapp.student9;

public final class Square extends Shape {
    // Create data members.
    private final int size;

    // Generate constructors.
    public Square(int size) {
        this.size = size;
    }

    // Generate overrides.
    @Override
    String draw() {
        String retval = " ";
        if (size == 1) {
            retval = "*";
        } else {
            retval += ("*".repeat(size) + "\n"); // Draw top.
            for (int i = 0; i < size - 2; i++) { // Draw body.
                retval += ("*" + " ".repeat(size - 2) + "\n");
            }
            retval += ("*".repeat(size) + "\n"); // Draw bottom.
        }
        return retval;
    }
}
