package com.xpanxion.myapp.student20;

public class Radnumber {
    //
    //Data members
    //
    private int number;

    //
    // Contractors
    //

    public Radnumber(int number) {
        this.number = number;
    }
    public Radnumber(){

    }
    public static int add(Radnumber n1, Radnumber n2) {
        int result = n1.number + n2.number;
        return result;
    }

    public static int subtract(Radnumber n1, Radnumber n2) {
        int result = n1.number - n2.number;
        return result;
    }

    //
    //Accessors
    //
}