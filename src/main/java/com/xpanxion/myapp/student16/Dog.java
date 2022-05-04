package com.xpanxion.myapp.student16;

public class Dog extends Animal {

    private static final byte age = 5;
    private String name;
    private String nickname;
    private String color;

    public Dog(String name, String nickname, String color) {
        super(age);
        this.name = name;
        this.nickname = nickname;
        this.color = color;
    }
}
