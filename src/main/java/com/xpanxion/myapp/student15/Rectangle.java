package com.xpanxion.myapp.student15;

    public final class Rectangle extends Shape {

        //
        // Data Members
        //

        private final int width;
        private final int height;

        //
        // Constructors
        //

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
