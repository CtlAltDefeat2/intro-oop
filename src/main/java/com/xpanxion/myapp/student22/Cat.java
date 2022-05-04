package com.xpanxion.myapp.student22;

public class Cat extends Animal {
    private String name;
    private String nickName;
    private String color;

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getColor() {
        return color;
    }

    public Cat(String name, String nickName, String color, int age) {
        super(age);
        this.name = name;
        this.nickName = nickName;
        this.color = color;
    }
}
