package com.xpanxion.myapp.student5;


public class AwesomeNumber {
    // Variable Declarations
    private int num;
    // Constructors
    public AwesomeNumber (int num) {
        this.num = num;
    }
    // Methods
    public static int add(AwesomeNumber n1, AwesomeNumber n2) {
        int result = n1.num + n2.num;
        return result;
    }
    public static int subtract(AwesomeNumber n1, AwesomeNumber n2) {
        int result = n1.num - n2.num;
        return result;
    }
}
