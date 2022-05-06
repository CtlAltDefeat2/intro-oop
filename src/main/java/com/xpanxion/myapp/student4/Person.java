package com.xpanxion.myapp.student4;

public class Person extends Animal {

    private String firstName;
    private String lastName;
    private byte age ;
    private String ssn;
    static int personCount = 0;

    public Person(String firstName,String lastName){
        super();
        personCount++;
        this.firstName = firstName;
        this.lastName  = lastName;

    }

    public Person(String firstName, String lastName, byte age, String ssn){
        personCount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this .age = age;
        this.ssn = ssn;

    }

    public Person() {
      personCount++ ;

    }



    public String getFirstName() {
        return firstName;
    }
    public String speak(){

        if (firstName != null && lastName != null && age <=0 ){
        return "My name is :  " + firstName + " " + lastName;
        } else if (firstName==null && lastName == null) {
            return "I don't have a name";}
        else {
            return "My name is " + firstName + " " + lastName + "  and I am " + age + " years old ";

        }
    }
  @Override
  public String toString(){

        if (firstName == null && lastName == null){
            return "N/A";
        } else if (ssn == null) {
            return " " + firstName + " " + lastName;
        }else
            return firstName + " "+ lastName + " " + ssn;



        }
    protected static int getPersonCount() {
        return personCount;
    }

}

