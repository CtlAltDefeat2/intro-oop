package com.xpanxion.myapp.student26;

public class Person extends Animal {

    private String firstName;
    private String lastName;
    private byte age=0;
    private Integer SSN =0;
    private static Integer person = 0;

    Person() {
        this.person++;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.person++;
    }

    Person(String firstName, String lastName, Byte age, Integer SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.SSN = SSN;
        this.person++;
    }

    public static Integer getPersonCount() {
        return person++;
    }

    public String speak() {


        if (firstName == null && lastName == null ) {
            return "I don't have a name";
        }
        else if (age != 0) {
            return "My name is " + firstName + " " + lastName + " and I am " + age + " years old";
        }
        else {
            return "My name is " + firstName + " " + lastName;
        }
    }

    private String lastFour(Integer SSN) {

        return Integer.toString(SSN).substring(5);

    }

    public String toString() {

        if (firstName==null && lastName==null) {
            return "N/A";
        }
        else if (age <= 0 ) {
            return firstName + " " + lastName;

        }
        else {
            return  firstName + " " + lastName + " " + lastFour(SSN);
        }
    }

}

