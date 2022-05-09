package com.xpanxion.myapp.student15;


    public final class Square extends Shape{

        //
        // Data Members
        //

        private final int size;

        //
        // Constructors
        //

        public Square(int size) {
            this.size = size;
        }

        @Override
        String draw() {
            String retval = "";
            if (size == 1) {
                retval = "*";
            } else {
                retval += ("*".repeat(size) + "\n"); // Draw top
                for (int i = 0; i < size - 2; i++) { // Draw body
                    retval += ("*" + " ".repeat(size - 2) + "*\n");
                }
                retval += ("*".repeat(size) + "\n"); // Draw bottom
            }
            return retval;
        }
    }

