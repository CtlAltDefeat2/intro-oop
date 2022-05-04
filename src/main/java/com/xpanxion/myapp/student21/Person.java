package com.xpanxion.myapp.student21;

public class Person extends Animal {
    private String firstName;
    private String lastName;
    private String ssn;

    private static int personCount;


    Person() {
        super();
        personCount++;
    }
    Person(String firstName, String lastName){
        super();
        personCount++;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person(String firstName, String lastName, int age, String ssn){
        super(age);
        personCount++;
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
    }

    public static int getPersonCount() {
        return personCount;
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

    public String getSsn() {

        return ssn.substring(5);
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String speak(){
        if(firstName==null&&lastName==null){
            return "I do not have a name.";
        }else if (firstName !=null && lastName!=null && super.getAge()== 0) {
            return "My name is " + firstName + " " + lastName;
        }else {
            return "My name is " + firstName + " " + lastName + " and I am " + super.getAge() + " years old.";
        }
    }

    @Override
    public String toString() {
        if(firstName == null && lastName==null){
            return "N/A";
        }else if(ssn == null){
            return firstName + " " + lastName;
        }else
            return firstName + " " + lastName + " " + getSsn();
    }
}
