package com.xpanxion.myapp.student9;

public class Fruit extends Food {
    // Add data members.
    private String name;
    private String color;
    private String season;

    // Add constructors.
    public Fruit(String type, String name, String color, String season) {
        super(type);
        this.name = name;
        this.color = color;
        this.season = season;
    }
}
