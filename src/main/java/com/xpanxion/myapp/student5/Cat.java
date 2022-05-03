package com.xpanxion.myapp.student5;

public class Cat extends Animal {
    // Variable Declarations
    private String catName;
    private String catNickName;
    private String catColor;
    private static int catCount = 0;
    // Constructors
    public Cat (String catName, String catNickName, String catColor, byte age) {
        this.catName = catName;
        this.catNickName = catNickName;
        this.catColor = catColor;
        this.age = age;
        this.catCount++;
    }
    // Methods
    public static int getCatCount () {
        return catCount++;
    }
    // Accessors
    public String getCatName () {
        return catName;
    }
    public String getCatNickName () {
        return catNickName;
    }
    public String getCatColor () {
        return catColor;
    }
    // Overrides
}
