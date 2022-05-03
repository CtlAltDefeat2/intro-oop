package com.xpanxion.myapp.student5;

public class Person extends Animal {
    // Variable Declarations
    private String firstName;
    private String lastName;
    private byte age;
    private String ssn;
    private String ssnLast4;
    private static int personCount = 0;
    // Constructors
    public Person () {
        this.personCount++;
    }
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }
    public Person (String firstName, String lastName, byte age, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        ssnLast4 = ssn.replaceFirst("^.{5}", "*****");
        this.personCount++;
    }
    // Methods
    public static int getPersonCount() {
        return personCount++;
    }
    public String speak() {
        if (firstName == null || lastName == null) {
            System.out.println("I don't have a name.");
        } else if (age == 0) {
            System.out.println("My name is " + firstName + " " + lastName + ".");
        } else {
            System.out.println("My name is " + firstName + " " + lastName + " and I am " + age + " years old.");
        } return "";
    }
    // Accessors
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSsn() {
        return ssn;
    }
    // Overrides
    @Override
    public String toString() {
        String personStatement;
        if (firstName == null || lastName == null) {
            personStatement = "N/A";
        } else if (age == 0 || ssn == null) {
            personStatement = firstName + " " + lastName;
        } else {
            personStatement = firstName + " " + lastName + " " + ssnLast4;
        } return personStatement;
    }
}
