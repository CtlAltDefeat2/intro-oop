package com.xpanxion.myapp.student4;

public class Person {
    private String firstName;
    private String lastName;
    private int age ;
    private String ssn;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    public Person(String firstName, String lastName, int age, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this .age = age;
        this.ssn = ssn;
    }

    public Person() {

    }

    public static String getPersonCount() {
        return null;
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
            return " My name is " + firstName + "" + lastName + "and I am" + age + "" + ssn;

        }
    }
  @Override
  public String toString(){
        if (firstName == null && lastName == null){
            return "N/A";
        } else if (ssn == null) {
            return "My first name is : " + firstName + " " + lastName;
        }else
            return firstName + " "+ lastName + " " + ssn;
        }
  }

