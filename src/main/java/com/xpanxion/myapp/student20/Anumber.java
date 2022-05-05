package com.xpanxion.myapp.student20;

public class Anumber {
    //
    //Data members
    //
    private int number;

    //
    // Contractors
    //

    public Anumber(int number) {

        this.number = number;
    }
    public Anumber(){

    }
    public static int add(Anumber n1, Anumber n2) {
        int result = n1.number + n2.number;
        return result;
    }

    public static int subtract(Anumber n1, Anumber n2) {
        int result = n1.number - n2.number;
        return result;
    }

    //
    //Accessors
    //
}