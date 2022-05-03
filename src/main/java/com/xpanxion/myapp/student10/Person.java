package com.xpanxion.myapp.student10;

public class Person {
    private String Fname;
    private String Lname;
    private byte age;
    private String social;
    private static int personCount = 0;

    public Person(){
        this.personCount++;
    }

    public Person(String Fname, String Lname){
        this.Fname = Fname;
        this.Lname = Lname;
        this.personCount++;
    }

    public Person(String Fname, String Lname, byte age){
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.personCount++;
    }

    public Person(String Fname, String Lname, byte age, int social){
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        String num = String.valueOf(social);
        this.social = num.replaceFirst("^.{5}", "*****");
        this.personCount++;
    }

    public static int getPersonCount(){
        return personCount++;
    }

    public String speak(){
        if (Fname == null) {
            return "I don't have a name";
        }

        else if (age < 0) {
            return "My name is " + Fname + " " + Lname;
        }

        else if (age > 0) {
            return "My name is " + Fname + " " + Lname + " and I am " + age + " years old";
        }

        return "";
    }

    public String getSocial(){
        return this.social;
    }

    //override
    public String toString(){
        if (Fname == null){
            return "N/A";
        }

        else if (social == null) {
            return Fname + " " + Lname;
        }

        return Fname + " " + Lname + " " + social;
    }
}
