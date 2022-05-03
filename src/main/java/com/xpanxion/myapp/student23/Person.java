package com.xpanxion.myapp.student23;

  public class Person {
    //define attributes
    // Data members, fields, attributes, instance vars, properties, props, or state.
    private String firstName;
    private String lastName;
    private byte age;
    private int ssn;
    private static int personCount;

    //define constructors
    public Person(){
    }

    public Person(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
    }
    public Person(String firstName, String lastName, byte age, int ssn){
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.ssn = ssn;
    }

    public String speak(){
      String retVal = "I don't have a name.";
      if (firstName != null && lastName != null && age == 0) {
        retVal = "My name is " + firstName + " " + lastName + ".";
      }
      if (firstName != null && lastName != null && age > 0) {
        retVal = "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";
      }
      return retVal;
    }

    //define methods/behaviors

    public byte getPersonCount() {
      return 0;
    }
  }
