package com.xpanxion.myapp.student5;

public class Dog extends Animal {
    // Variable Declarations
    private String dogName;
    private String dogNickName;
    private String dogColor;
    private static int dogCount = 0;
    // Constructors
    public Dog (String dogName, String dogNickName, String dogColor, byte age) {
        this.dogName = dogName;
        this.dogNickName = dogNickName;
        this.dogColor = dogColor;
        this.age = age;
        this.dogCount++;
    }
    // Methods
    public static int getDogCount() {
        return dogCount++;
    }
    // Accessors
    public String getDogName() {
        return dogName;
    }
    public String getDogNickName() {
        return dogNickName;
    }
    public String getDogColor() {
        return dogColor;
    }
    // Overrides
}
