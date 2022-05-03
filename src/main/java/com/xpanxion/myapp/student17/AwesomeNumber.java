package com.xpanxion.myapp.student17;

public class AwesomeNumber {
    //
    //Data members
    //
    private int number;

    //
    // Contractors
    //

    public AwesomeNumber(int number) {
       this.number = number;
    }
    public AwesomeNumber(){

    }
    public static int add(AwesomeNumber n1, AwesomeNumber n2) {
        int result = n1.number + n2.number;
        return result;
    }

    public static int subtract(AwesomeNumber n1, AwesomeNumber n2) {
        int result = n1.number - n2.number;
        return result;
    }

    //
    //Accessors
    //
}
