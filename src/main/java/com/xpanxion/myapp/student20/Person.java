package com.xpanxion.myapp.student20;

public class Person extends Animal {
    //Date Members
    private String firstName;
    private String lastName;
    private String ssn;
    private static int personCount = 0;
    //Constructors
    public Person() {
        this.personCount++;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }
    public Person(String firstName, String lastName, byte age, int ssn){
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        String num = String.valueOf(ssn);
        this.ssn = num.replaceFirst("^.{5}", "*****");
        this.personCount++;
    }
    public static int getPersonCount() {
        return personCount++;
    }
    public String speak() {
        if(firstName == null){
            return "I don't have a name";
        }
        else if(age == 0){
            return "My name is " + firstName + " " + lastName;
        }
        return "My name is " + firstName + " " + lastName + " and my age is " + age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //Override
    @Override
    public String toString() {
        if(firstName == null){
            return "N/A";
        }
        else if(ssn == null){
            return  firstName + " " + lastName;
        }
        return
                firstName + " " + lastName + " " + ssn ;
    }


}