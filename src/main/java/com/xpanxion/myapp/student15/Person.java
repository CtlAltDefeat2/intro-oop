package com.xpanxion.myapp.student15;

public class Person extends Animal {
    // Extends someSuperClass //Implements some Interfaces seperated by commas
    // Data Members
    // Constructors
    // Methods

    //
    // Data Members
    //

    private String firstName;
    private String lastName;

    private Integer ssn;

    private static int personCount;

    // constructors

    Person() {
        this.personCount++;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }

    Person(String firstName, String lastName, Byte age, Integer ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
         this.ssn = ssn;
        this.personCount++;
    }

    //Methods
    public static int getPersonCount() {
        return personCount++;
    }

    public String speak() {
        var message = "";
        if (firstName == null && lastName == null) {
            message = "I don't have a name";
        } else if (getAge() == null) {
            message = "My name is " + firstName + " " + lastName;
        } else {
            message = "My name is " + firstName + " " + lastName + " and I am " + getAge() + " years old.";
        }
        return message;
    }

// Refactor the Person class to subclass (extend) a class called Animal. Move the age from the Person class to the Animal class.
// Create a Dog and Cat class that subclass the Animal class.
//
// The Dog and Cat class have the following properties:
//
// Name
// Nickname
// Color




//
//Overrides

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

