package com.xpanxion.myapp.student9;

public class Animal {

    //
    // Data members
    //

    private Byte age;

    //
    // Constructors
    //

    public Animal() {}

    public Animal(Byte age) {
        this.age = age;
    }
    public Animal(int age) {
        // test
    }

    public Animal(Byte age, String color) {
        this.age = age;
    }

    //
    // Accessors
    //

    public Byte getAge() {
        return age;
    }
}
