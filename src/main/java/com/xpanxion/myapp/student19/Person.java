package com.xpanxion.myapp.student19;

public class Person extends Animal{
    private String lastName;
    private String firstName;
    private String ssn;
    //Class Constructors
  public Person(){
        }
    public Person(String name, String nickName, String color, int age, String firstName, String lastName) {
    super(name, nickName, color, age);
    this.lastName = lastName;
    this.firstName = firstName;
    }
    public Person(String name, String nickName, String color, int age, String firstName, String lastName, String ssn) {
      super(name, nickName, color, age);
      this.lastName = lastName;
      this.firstName = firstName;
      this.ssn = ssn;
        System.out.println("Mat Smith.");
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
            return "my name is " + firstName + " "+lastName + " and my age is " + age;
        else if (firstName != null && lastName!= null)
            return "my name is " + firstName + " "+lastName;

        return "I don't have a name";
    }
    public static int getPersonCount(){
        int count = 3;
        return count;
    }

}