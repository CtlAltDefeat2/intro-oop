package com.xpanxion.myapp.student9;

// Create data members.
public class Person extends Animal {
    private String firstName;
    private String lastName;
    private Integer ssn;

    private static int personCount = 0;

    // Initiate constructors.
    Person() {
        super();
        this.personCount++;
    }

    Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }

    Person(String firstName, String lastName, Byte age, Integer ssn) {
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.personCount++;
    }

    public String speak() {
        var message = "";
        if (firstName == null && lastName == null) {
            message = "I don't have a name.";
        } else if (getAge() == null) {
            message = "My name is " + firstName + " " + lastName;
        } else {
            message = "My name is " + firstName + " " + lastName + " and I am " + getAge() + " years old.";
        }
        // Handle the three use cases: no name; first and last name; first name, last name, and age.
        return message;
    }
// Create override.

    //Override the toString() method.
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

    public static int getPersonCount() {
        return personCount;
    }
}
