package com.xpanxion.myapp.student2;

public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;
    Person(){}
    Person(String firstName, String lastName){
        this.lastName=lastName;
        this.firstName=firstName;
    }
    Person(String firstName, String lastName, byte age, int ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.ssn=ssn;
        System.out.println("");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public String speak(){
        if (firstName==null){
            return "I don't have a name.";
        } else if (age>0) {
            return "My name is "+firstName+" "+lastName+" and I am "+age+" years old.";
        }
        return "My name is "+firstName+" "+lastName;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
}

