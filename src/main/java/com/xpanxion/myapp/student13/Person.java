package com.xpanxion.myapp.student13;

public class Person {

    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;

    Person() {

    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String speak() {
        if (firstName == "Jon" && lastName == "Smith") {
            return "My name is " + firstName + " " + lastName + ".";
        } else if (firstName == "Mary" && lastName == "Jane") {
            return "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";
        } else {
            return "I don't have a name.";
        }
    }
}
