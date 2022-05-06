package com.xpanxion.myapp.student26;

public class Dog extends Animal{

    private String name;
    private String nickname;
    private String color;

    public Dog() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    Dog(String name, String nickname, String color) {
        this.name=name;
        this.nickname=nickname;
        this.color=color;
    }

}
