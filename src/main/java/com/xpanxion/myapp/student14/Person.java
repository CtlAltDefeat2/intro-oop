package com.xpanxion.myapp.student14;

public class Person {
    //Extends someSuperClass //Implements someInterfaces separated by commas {
    //Data Members
    //Constructors
    //Methods

    //
    // Data Members
    //

    private String firstName;
    private String lastName;
    private Byte age;
    private Integer ssn;

    //
    // Constructors
    //

    Person () {
    }

    Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person (String firstName, String lastName, Byte age, Integer ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    //
    // Methods
    //

    public String speak() {
        // TODO: Handle the three use cases... 1) No name, 2) First and Lastname, 3) FN, LN, Age.
        return "My name is: " + firstName;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        // TODO: Override the toString() method..
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
