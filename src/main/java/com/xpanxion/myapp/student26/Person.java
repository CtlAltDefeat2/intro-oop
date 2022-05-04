package com.xpanxion.myapp.student26;

public class Person {

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

        String retval = "I dont have a name";
        if (firstName != null && lastName != null && age == 0) {
            retval = "My name is " + firstName + " " + lastName;
        }
        if (firstName != null && lastName != null && age > 0) {
            return "My name is " + firstName + " " + lastName + " and I am " + age + " years old";
        }
        return retval;
    }

    private String lastFour(Integer SSN) {

            return Integer.toString(SSN).substring(5);

    }

    public String toString() {
        String retVal = "N/A";
        if (firstName != null && lastName != null && age == 0) {
            retVal = firstName + " " + lastName;
        }
        if (firstName != null && lastName != null && SSN > 0) {
            retVal = firstName + " " + lastName + " " + lastFour(SSN);

        }
        return retVal;
    }

}

