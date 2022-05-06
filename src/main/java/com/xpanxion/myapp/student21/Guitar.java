package com.xpanxion.myapp.student21;

public class Guitar {
    private String color;
    private int numStrings;
    private static int guitarCount;

    public Guitar() {
        guitarCount++;
    }

    public Guitar(String color, int numStrings) {
        this.color = color;
        this.numStrings = numStrings;
        guitarCount++;
    }
}
