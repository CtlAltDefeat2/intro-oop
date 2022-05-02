package com.xpanxion.myapp.student7;

public class Person extends Animal {
    private String firstName;
    private String lastName;
    private static int personCount = 0;
    private int ssn;
    Person() {
        personCount++;
    }
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }
    Person(String firstName, String lastName, int age){
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }
    Person(String firstName, String lastName, int age, int ssn){
        super(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.personCount++;
    }
    public String speak(){
        return "My name is " + firstName + " " + lastName + "and my age is " + age +".";
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static int getPersonCount() {
        return personCount;
    }
    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }
    public int getSsn() {
        return ssn;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return
                "firstName= " + firstName +
                ", lastName= " + lastName +
                ", ssn= " + ssn ;
    }
}
