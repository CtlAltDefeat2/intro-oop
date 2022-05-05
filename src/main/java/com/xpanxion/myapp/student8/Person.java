package com.xpanxion.myapp.student8;

public class Person extends Animal {

    String firstName;
    String lastName;
    int SSN;
    int type;
    private static int counter;


    public Person() {
        counter++;
        type = 1;
    }

    public Person(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
        counter++;
        type = 2;
    }

    public Person(String firstname, String lastname, byte age, int ssn) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.Age = age;
        this.SSN = ssn;
        counter++;
        type = 3;
    }


    public String speak() {
        if (type == 1) {
            return "I don't have a name";
        }
        if (type == 2) {
            return "My name is " + firstName + " " + lastName;
        }
        if (type == 3) {
            return "My name is " + firstName + " " + lastName + " and I am " + Age + " years old.";
        }
        return null;
    }


    public static int getPersonCount() {
        return counter;
    }

    @Override
    public String toString() {

        if (type == 1) {
            return "N/A";
        }
        if (type == 2) {
            return firstName + " " + lastName;
        }
        if (type == 3) {
            String lastFourDigits = String.valueOf(SSN);
            return firstName + " " + lastName + " " + lastFourDigits.substring(lastFourDigits.length()-4);
        }
        return null;
    }

}