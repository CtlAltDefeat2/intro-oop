package com.xpanxion.myapp.student8;

public class Person {

    String firstName;
    String lastName;
    byte Age;
    int SSN;

    private static int counter;


    public Person() {
        counter++;
        System.out.println("N/A");
    }

    public Person(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
        counter++;
        System.out.println(firstName + "" + lastName);
    }

    public Person(String firstname, String lastname, byte age, int ssn) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.Age = age;
        this.SSN = ssn;
        counter++;
        System.out.println(firstName + " " + lastName + " " + SSN);
    }


//    public speak() {
//
//    }

    public static int getPersonCount() {
        return counter;
    }

}
