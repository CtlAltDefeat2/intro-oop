package com.xpanxion.myapp.student6;

public class Person {
    private int ssn;
    private byte age;
    private String firstName, lastName;
    private static int count = 0;

    Person() {
        this.count++;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.count++;
    }

    Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        String ssnStr = String.valueOf(ssn);
        this.count++;

    }
        public String lastFour (String ssnStr) {
            String lastFour = "";

            if (ssnStr.length() > 4) {
                lastFour = ssnStr.substring(ssnStr.length() - 4);
            } else {
                lastFour = ssnStr;
            }
            System.out.println(lastFour);
            return lastFour;
        }


    public static int getPersonCount() {
       return count++;
    }

    public String speak() {
        var speak = "";

        if (firstName == null && lastName == null) {
            System.out.print("I don't have a name.");
        } else if (firstName == "Jon" && lastName == "Smith") {
            System.out.print("My name is " + firstName + " " + lastName + ".");
        } else if (firstName == "Mary" && lastName == "Jane") {
            System.out.print("My name is " + firstName + " " + lastName + " " + "and I am " + age + " " + "years old.");
        }
        return speak;
    }

    @Override
    public String toString() {
        String string = "";

        if (firstName == null && lastName == null) {
            string = "N/A";
        }
        else if (firstName != null) {
            if (ssn > 0) {
                var lastFour = Integer.toString(ssn).substring(5);
                string = firstName + " " + lastName + " " + lastFour;
            }
            else {
                string = firstName + " " + lastName;
            }
        }
        return string;
    }
}