package com.xpanxion.myapp.student19;

public class Animal {
    protected String name;
    protected String nickName;
    protected String color;
    protected int age;
    public Animal() {}
    public Animal (String name, String nickName, String color, int age) {
        this.name = name;
        this.nickName = nickName;
        this.color = color;
        this.age = age;
        System.out.println("You are in Animal super class");
    }

}
