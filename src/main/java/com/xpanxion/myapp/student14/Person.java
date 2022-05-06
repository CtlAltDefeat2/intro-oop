package com.xpanxion.myapp.student14;

import java.util.Scanner;

class Person extends Animal {
    //Extends someSuperClass //Implements someInterfaces separated by commas {
    //Data Members
    //Constructors
    //Methods
    //Overrides

    //
    // Data Members
    //

    private String firstName;
    private String lastName;

    private Integer ssn;
    private static int personCount = 0;

    //
    // Constructors
    //

    Person () {
        this.personCount++;
    }

    Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }
    Person (String firstName, String lastName, Byte age, Integer ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.personCount++;
    }

    //
    // Methods
    //

    public static int getPersonCount() {
        return personCount++;
    }

    public String speak() {
        var message = "";
        if (firstName == null && lastName == null) {
            message = "I don't have a name.";
        } else if (age == null) {
            message = "My name is " + firstName + " " + lastName;
        } else {
            message = "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";
        }
        return message;
    }

    //
    // Overrides
    //
    @Override
    public String toString() {
        String retVal = "";
        if (firstName == null) {
            retVal = "N/A";
        } else if (ssn == null) {
            retVal = firstName + " " + lastName;
        }
        if (ssn != null) {
            var ssnString = Integer.toString(ssn).substring(5);
            retVal = firstName + " " + lastName + " " + ssnString;
        }
        return retVal;
    }
}