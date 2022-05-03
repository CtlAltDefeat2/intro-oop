package com.xpanxion.myapp.student7;

public class Person extends Animal {
    private String firstName;
    private String lastName;
    private static int personCount = 0;
    private int ssn;
    Person() {
        this.personCount++;
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
        if(firstName == null){
            return "I don't have a name";
        }
        else if(age == 0){//if there's no age
            return "My name is " + firstName + " " + lastName;
        }
        return "My name is " + firstName + " " + lastName + " and my age is " + age +".";
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
        return ssn %= 10000; //get the last four digit of ssn
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    @Override
    public String toString() {
        getSsn();
        if(firstName == null){ //if there's no info in person
            return "N/A";
        }
        else if(ssn == 0){
            return  "firstName = " + firstName +
                    ", lastName = " + lastName;
        }
        return
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", ssn = " + ssn ;
    }
}
