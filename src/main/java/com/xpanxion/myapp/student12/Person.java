package com.xpanxion.myapp.student12;

public class Person extends Animal {

    //
    //Data Members
    //
    private String firstName;
    private String lastName;

    private int ssn;
    private static int personCount = 0;

    //Constructors

    Person() {
        this.personCount++;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }

    Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.personCount++;
    }
    //
    //Accessors
    //
    public static int getPersonCount() {
        return personCount++;
    }

    //Methods/Functions

    public String speak() {
        if (firstName == null && lastName == null)
            return "I don't have a name.";
        else if (age != 0){
            return "My name is " + firstName + " " + lastName + " and I am " + age + " years old";
        }
        else {
            return "My name is " + firstName + " " + lastName;
        }
    }
    public String getSsn(int ssn) {
        return Integer.toString(ssn).substring(5);
    }

    @Override
    public String toString() {
        if (firstName == null && lastName == null) {
            return "N/A";
        } else if (age <= 0) {
            return firstName +" " +  lastName;

        } else {
            return firstName + " "  +  lastName + " " +  getSsn(ssn);
        }
    }


}
