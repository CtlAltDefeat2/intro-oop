package com.xpanxion.myapp.student12;

public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;
    private int personCount = 0;

    //Constructors

    Person() {
        personCount++;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        personCount++;
    }

    //Methods/Functions

    public String speak() {
        if (firstName == null && lastName == null)
            return "I don't have a name.";
        else {
            return "My name is " + firstName + " " + lastName;
        }
    }
    public String getSsn(int ssn) {
        return Integer.toString(ssn).substring(5);
    }

    public String toString() {
        if (firstName == null && lastName == null) {
            return "N/A";
        } else if (age <= 0) {
            return firstName +" " +  lastName;

        } else {
            return firstName + " "  +  lastName + " " +  getSsn(ssn);
        }
    }

    public int getPersonCount() {
        this.personCount = personCount;
        return personCount;
    }
}
