package com.xpanxion.myapp.student11;

public class Animal {
    //
    //Data Members
    //
    private byte age;

     //
    //Constructors
    //
    public Animal() {}

    public Animal(Byte age) {
        this.age = age;
    }

    public Animal (int age) {
        //test
    }
    public Animal (Byte age, String color) {
        this.age = age;
    }
    //
    //Accessors
    //
    public Byte getAge() {
        return age;
    }
}
