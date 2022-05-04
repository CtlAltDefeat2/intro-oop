package com.xpanxion.myapp.student24;

import java.util.ArrayList;

public class Person extends Animal{
    private String firstName;
    private String lastName;
    //private byte age;
    private int ssn;
    private static int personCount = 0;

    Person() {
        personCount++;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    Person(String firstName, String lastName, byte age) {
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    Person(String firstName, String lastName, byte age, int ssn) {
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        personCount++;
    }

    public String speak() {
        if (firstName == null) {
            return ("I don't have a name");
        } else if (age == 0) {
            return ("My name is " + firstName + " " + lastName);
        }
        return ("My name is " + firstName + " " + lastName + " and I am " + age + " years old.");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getSsn() {
        return ssn % 10000;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public static int getPersonCount() {
        return personCount;
    }

    @Override
    public String toString() {

        if (firstName == null) {
            return "N/A";
        }
        if (ssn == 0) {
            return firstName + " " + lastName;
        }
        ssn = getSsn();
        return firstName + " " +
                lastName + " " +
                +ssn;
    }
}


