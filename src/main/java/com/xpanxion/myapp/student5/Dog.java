package com.xpanxion.myapp.student5;

public class Dog extends Animal {
    private String dogName;
    private String dogNickName;
    private String dogColor;
    private static int dogCount = 0;
    public Dog (String dogName, String dogNickName, String dogColor, byte age) {
        this.dogName = dogName;
        this.dogNickName = dogNickName;
        this.dogColor = dogColor;
        this.age = age;
        this.dogCount++;
    }
    public static int getDogCount() {
        return dogCount++;
    }
}
