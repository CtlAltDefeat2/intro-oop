package com.xpanxion.myapp.student11;

public class Person {
    //declaring the data, attributes that belong to the class person.
    //data modifier is for info we want to protect which means we have to keep it private.
    //Is the format we have to follow.
private String firstName;
private String lastName;
private Byte age;
private Integer ssn;

//3 constructors. first thing that runs.
 Person() {
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
//methods - the layout of what we want ran. handle the 3 use cases.
            public String speak() {
            return "My name is: " + firstName;
            }
        }
            @Override
            public String toString() {
                return "Person{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", age=" + age +
                        ", ssn=" + ssn +
                        '}';
        }
}
