package com.xpanxion.myapp.student19;

public class Person {
    private String lastName;
    private String firstName;
    private  int age;
    private String ssn;
    //Class Constructors
    public Person() {  }
    public Person(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public Person(String firstName, String lastName, int age,String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public String toString() {

        if (firstName != null && lastName!= null && ssn != null)
            return firstName + " "+lastName + " " + ssn;
        else if (firstName != null && lastName!= null)
            return firstName + " "+lastName;

        return "N/A";
    }

    public String speak() {

        if (firstName != null && lastName!= null && age != 0)
            return "my mane is " + firstName + " "+lastName + " and my age is " + age;
        else if (firstName != null && lastName!= null)
            return "my mane is " + firstName + " "+lastName;

        return "I don't have a name";
    }
    public static int getPersonCount(){
        int count = 3;
        return count;
    }

}