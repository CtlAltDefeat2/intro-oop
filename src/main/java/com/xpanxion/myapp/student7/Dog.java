package com.xpanxion.myapp.student7;

public class Dog extends Animal{
    private String name;
    private String nickName;
    private String color;

    Dog(String name, String nickName, String color){
        this.name = name;
        this.nickName = nickName;
        this.color = color;
    }
    Dog(String name, String nickName, String color, int age){
        super(age);
        this.name = name;
        this.nickName = nickName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
