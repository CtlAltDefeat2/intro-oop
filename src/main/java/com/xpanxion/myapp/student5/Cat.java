package com.xpanxion.myapp.student5;

public class Cat extends Animal {
    private String name;
    private String nickName;
    private String color;
    private static int catCount = 0;
    public Cat (String name, String nickName, String color, byte age) {
        this.name = name;
        this.nickName = nickName;
        this.color = color;
        this.age = age;
        this.catCount++;
    }
    public static int getCatCount() {
        return catCount++;
    }
}
