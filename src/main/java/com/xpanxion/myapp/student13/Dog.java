package com.xpanxion.myapp.student13;

public class Dog extends Animal {
    private String Name;
    private String Nickname;
    private String Color;

    Dog(){
    }

    Dog(String Name, String Nickname, String Color) {
        this.Name = Name;
        this.Nickname = Nickname;
        this.Color = Color;
    }
    @Override
    public String toString() {
        return Name + Nickname + Color;
    }

}
