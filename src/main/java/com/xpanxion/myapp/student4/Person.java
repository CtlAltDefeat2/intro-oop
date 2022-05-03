package com.xpanxion.myapp.student4;

public class Person {
    private String firstName;
    private String lastName;
    private int age ;
    private String ssn;

    Person(String firstName, String lastName, int age, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this .age = age;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }
    public String speak(){
        if (firstName != null && lastName != null && age <=0 ){
        return "My name is:  " + firstName + " " + lastName;
        } else if (firstName==null && lastName == null) {
            return "I don't have a name";}
        else {
            return " My name is " + firstName + "" + lastName + "and I am" + age;

        }
    }

}
