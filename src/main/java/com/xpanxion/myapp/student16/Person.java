package com.xpanxion.myapp.student16;

import java.util.ArrayList;

//everything in java has an object.
//class is a blueprint to be reused over and over again.
public class Person extends Animal {//name of class always has capitalized first letter.
   //data members, field, properties, attributes, states
    //constructors listed below.
    //constructors - special method in a class set up the class for use.
    //constructors initialize the class so that it can be used.
    private String firstName; // string is best for word like first name.
    private String lastName;
    private byte age;
    private int ssn;
    private static byte personCount = 0; //maybe final?

    public static void main(String[] args) {
    }
    public Person(String jon, String smith) {
        this.firstName = jon;
        this.lastName = smith;
    }
    public static byte getPersonCount() {
        return personCount;
    }
    public static void setPersonCount(String personCount) {
        Person.personCount = Byte.parseByte(personCount);
    }
   //behavior is below.
    public String speak() {
        if (firstName == null) {
            return "I don't have name";
        }
        if (age == 0) {
            return "My name is " + firstName + " " + lastName;
        }
        return "My name is " + firstName + " " + lastName + " and I am " + age + " years old ";
    }
    //setters and getters (also known as accessors)
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
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public int getSsn() {
        return ssn % 10_000;//will return last 4 or SSN.
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public Person(String mary, String jane, byte age, int i) {
        super(age);
        this.firstName = mary;
        this.lastName = jane;
        //byte age = 12;
        this.age = 12;
        this.ssn = 123456789;
        //byte =12
        //this.byte =12;
        //int ssn = 123456789;
        //this.int = 123456789;
    }

    public Person() {

    }

    @Override // overriding the base class. (annotation)
    //created a toString method based on private data.
    public String toString() {
        if (firstName == null)
            return "N/A";
        if (ssn == 0)
            return firstName + " " + lastName;
        ssn = getSsn( );
        return
                firstName +
                        " " + lastName +
                        " " + ssn;
    }
}





