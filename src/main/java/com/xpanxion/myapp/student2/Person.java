package com.xpanxion.myapp.student2;

public class Person extends Animal{
    private String firstName;
    private String lastName;
    //added age back in because there was code that needed age in order to run. Now I don't have any errors.
    private byte age;
    private int ssn;
    Person(){
        this.firstName="N";
        this.lastName="/A";
    }
    Person(String firstName, String lastName){
        this.lastName=lastName;
        this.firstName=firstName;
    }
    Person(String firstName, String lastName, byte age, int ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        setSsn(6789);
    }

    public static String getPersonCount() {
        return"3";
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
        if (firstName=="N"){
            return "I don't have a name.";
        } else if (age>0) {
            return "My name is "+firstName+" "+lastName+" and I am "+age+" years old.";
        }
        return "My name is "+firstName+" "+lastName;
    }

    @Override
    public String toString() {
        if (ssn>0){
            return firstName+" "+lastName+" "+getSsn();
        } else if (firstName.equals("N")) {
            return  firstName+lastName;
        }
        else return firstName+" "+lastName;
    }
}

