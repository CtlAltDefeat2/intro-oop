package com.xpanxion.myapp.student21;

public class Animal {
    private int age;

    //Empty constructor for Person objects that do not have an age
    public Animal() {
    }

    public Animal(int age) {

        this.age = age;

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
