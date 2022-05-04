package com.xpanxion.myapp.student26;

public class Cat extends Animal{
    private String name;
    private String nickname;
    private String color;

    public Cat () {}

    public String getName() {
        return name;
    }
    public String getNickname() {
        return nickname;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setColor(String color) {
        this.color = color;
    }

    Cat(String name, String nickname, String color) {
        this.name=name;
        this.nickname=nickname;
        this.color=color;
    }
}
