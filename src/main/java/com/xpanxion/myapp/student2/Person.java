package com.xpanxion.myapp.student2;

public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;

    Person(){
        System.out.println("I don't have a name.");
    }
    Person(String firstName, String lastName){
        this();
        System.out.println(firstName+" "+lastName);
    }
    Person(String firstName, String lastName, byte age, int ssn){
        this(firstName, lastName);
        System.out.println(firstName+" "+lastName+" and I am "+age+" years old.");
    }



    public String speak(String firstName, String lastName, byte age, int ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        return "My name is "+firstName+" "+lastName+" and I am "+age+" years old.";
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

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }

    public String speak() {
        return "My name is "+firstName+" "+lastName+" and I am "+age+" years old.";
    }
}

