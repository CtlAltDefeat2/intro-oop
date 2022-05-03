package com.xpanxion.myapp.student3;

public class person {
    private static int personCount = 0;
    private String firstname;
    private String lastname;
    private int age;
    private int ssn;

    person() {
        this.personCount++;
    }

    person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.personCount++;

    }

    person(String firstname, String lastname, int age, int ssn) {
        this.age = age;
        this.ssn = ssn;
        this.firstname = firstname;
        this.lastname = lastname;
        this.personCount++;
    }

    public String speak() {
        if (firstname == null){
        return "N/A";}
        if (lastname == null){
            return "N/A";}
        if (age == 0){
            return "my first name is:" + firstname + " my last name is:" +  lastname;
        }
        return "my first name is:" + firstname + " my last name is:" +  lastname + " and my age is:" + age;


    }

    public static int getPersonCount() {
        return personCount;
    }

    public int getSsn() {
        return ssn %= 10000;
    }

    @Override
    public String toString() {
        getSsn();
        if (firstname == null) {
            return "N/A";

        }

        else if (ssn == 0){
            return  "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' ;
        }

        return "person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
