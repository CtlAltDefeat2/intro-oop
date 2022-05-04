package com.xpanxion.myapp.student13;

import org.w3c.dom.ls.LSOutput;

// Create Person class
public class Person {

    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;
    private static int countPerson = 0;

    // Default person constructor
    Person() {
        this.countPerson++;
    }
    // First & last name constructor
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countPerson++;
    }
    // Additional parameters constructor
    Person(String firstName, String lastName, byte ag, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.age = age;
        this.ssn = ssn;
        this.countPerson++;
    }

    public Person(byte age) {
        this.age = age;
    }

    public static int getPersonCount() {
        return countPerson++;
    }
    // Functions
    public String speak() {
        if (firstName == null && lastName == null) {
            return "I don't have a name.";
        } else if (age == 0) {
            return "My name is " + firstName + " " + lastName + ".";
        } else {
            return "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";
        }
    }

    public String getSsn(int ssn) {
        return Integer.toString(ssn).substring(5);
    }

    @Override
    public String toString() {
        if (firstName == null && lastName == null) {
            return "N/A";
        } else if (ssn == 0) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + lastName + " " + getSsn(ssn);
        }
    }
}
