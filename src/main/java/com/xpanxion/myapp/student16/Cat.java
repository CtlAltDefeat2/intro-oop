package com.xpanxion.myapp.student16;

public class Cat extends Animal {

    private static final byte age = 3;
    private String name;
    private String nickname;
    private String color;

    public Cat(String name, String nickname, String color) {
        super(age);
        this.name = name;
        this.nickname = nickname;
        this.color =color;
    }
}
