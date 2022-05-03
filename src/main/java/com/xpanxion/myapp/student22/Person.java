package com.xpanxion.myapp.student22;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    public static int getPersonCount() {
        int personCount = 0;
       return personCount++;
    }

     int personCount;
    private String firstName;

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
    private byte age;

    public String getSsn() {
        return ssn;
    }

    private String ssn;


    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName, byte age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        String myPrint = " ";
        if (firstName == null) {
            myPrint = "N/A";
        }
        else if (ssn == null){
            myPrint = firstName + " " + lastName;

        }
        else {
            myPrint = firstName + " " + lastName + " " + ssn.substring(5);
        }
        return myPrint;
    }

    public String Speak() {
        String speak ="";
        if (firstName == null){
             speak = "I dont have a name";
             personCount++;

        }
        if (firstName != null & lastName != null){
            speak = "My name is " + getFirstName() + " " + getLastName();


        }
       if (firstName != null && lastName != null && ssn != null)
         {
            speak = "My name is " + getFirstName() + " " + getLastName() + " and i am " + getAge() + " old";
            personCount++;

        }

      return speak;

    }

}

