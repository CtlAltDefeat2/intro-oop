package com.xpanxion.myapp.student7;

public class Cat extends Animal{
    private String name;
    private String nickName;
    private String color;

    Cat(String name, String nickName, String color){
        this.name = name;
        this.nickName = nickName;
        this.color = color;
    }
    Cat(String name, String nickName, String color, int age){
        super(age);
        this.name = name;
        this.nickName = nickName;
        this.color = color;
    }

}
