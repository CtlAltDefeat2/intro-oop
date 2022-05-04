package com.xpanxion.myapp.student22;

public class Dog extends Animal {
    private String name;
    private String nickName;
    private String color;

    public Dog(String name, String nickName, String color, int age) {
        super(age);
        this.name = name;
        this.nickName = nickName;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
