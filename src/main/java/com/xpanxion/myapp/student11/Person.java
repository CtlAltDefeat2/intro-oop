package com.xpanxion.myapp.student11;

public class Person {
    //declaring the data, attributes that belong to the class person.
    //data modifier is for info we want to protect which means we have to keep it private.
    //Is the format we have to follow.
private String firstName;
private String lastName;
private Byte age;
private Integer ssn;

private static int personCount = 0;

//3 constructors. first thing that runs.
 Person() { this.personCount++;}

 Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
this.personCount++;
    }
Person (String firstName, String lastName, Byte age, Integer ssn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.ssn = ssn;
            this.personCount++;
        }
//methods - the layout of what we want ran. handle the 3 use cases.

    public static int getPersonCount() {return personCount++;}
            public String speak() {
     var message = "";
     if (firstName == null && lastName == null) {
         message = "I don't have a name.";
     } else if (age == null) {
         message = "My name is " + firstName + " " + lastName;
     } else {
         message = "My name is " + firstName + " " + lastName + "and I am " + age + "years old.";
     }
            return message;
            }
        //override
            @Override
            public String toString() {
     String reVal = "";
     if (firstName == null) {
         reVal = "N/A";
     } else if (ssn == null) {
         reVal = firstName + " " + lastName;
     }
     if (ssn != null) {
         var ssnString = Integer.toString(ssn).substring(5);
         reVal = firstName + " " + lastName + " " + ssnString;
     }
     return reVal;
        }
}
