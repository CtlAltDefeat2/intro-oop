package com.xpanxion.myapp.student23;

  public class Person extends Animal {
    //define attributes
    // Data members, fields, attributes, instance vars, properties, props, or state.
    private String firstName;
    private String lastName;

    private int ssn;
    private static int personCount;

    //define constructors
    public Person(){
      personCount++;
    }

    public Person(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
      personCount++;
    }
    public Person(String firstName, String lastName, byte age, int ssn){
      this.firstName = firstName;
      this.lastName = lastName;
     // this.age = age;
      this.ssn = ssn;
      personCount++;
    }

    public String speak(){
      String retVal = "I don't have a name.";
      if (firstName != null && lastName != null && getAge() == 0) {
        retVal = "My name is " + firstName + " " + lastName + ".";
      }
      if (firstName != null && lastName != null && getAge() > 0) {
        retVal = "My name is " + firstName + " " + lastName + " and I am " + getAge() + " years old.";
      }
      return retVal;
    }

    //define methods/behaviors

    public static int getPersonCount() {
      return personCount;
    }

    @Override
    public String toString() {
      String retVal = "N/A";
      if (firstName != null && lastName != null && getAge() == 0) {
        retVal = firstName + " " + lastName ;
      }
      if (firstName != null && lastName != null && ssn > 0) {
        retVal = firstName + " " + lastName + " " + Integer.toString(ssn).substring(5);
      }
      return retVal;
    }
  }
