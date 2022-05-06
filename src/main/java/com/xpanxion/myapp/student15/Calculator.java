package com.xpanxion.myapp.student15;

import java.util.ArrayList;

public class Calculator implements Calculatable {
    private int number1;
    private int number2;
private static String variable = "";

    // generate constructor

    public Calculator() {
        this.number1 = number1;
        this.number2 = number2;
    }

    //Define an add function - Method

     private static int add(int number1, int number2) {
        return number1 + number2;
    }

    // Define a subtract function
    private static int subtract(int number1, int number2) {
        if (number1 > number2)
            return number1 - number2;
        else
            return number2 - number1;
    }

    // Define a Divide function
    private static int divide(int number1, int number2) {
        return number1 / number2;
    }

    //Define a Multiply function
    private static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public Integer add(Integer number1, Integer number2) {
        var a = number1+number2;
        variable = variable+ number1 +"+" + number2+ "=" + a+ "\n";
                return a ;

    }
    @Override
    public Integer subtract(Integer number1, Integer number2) {
        var a = number1-number2;
        var b = number1-number2;
        variable = variable+ number1 +"-" + number2+ "=" + a+ "\n";
        if(number1>number2)
            return a;
        else
            return b;
    }
    @Override
    public Integer multiply(Integer number1, Integer number2) {
        var a = number1*number2;
        variable = variable+ number1 +"*" + number2+ "=" + a+ "\n";
        return number1 * number2;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        var a = number1/number2;
        variable = variable+ number1 +"/" + number2+ "=" + a+ "\n";
        return number1 / number2;
    }

    @Override
    public String getHistory() {

        //    for(int i =0; i<Arraylist.size;i++ )
//        a = a+ArrayList.get(i)
            return variable;
    }
}

//The Calculator class can be consumed in the following manner:
//
//var calculator =  new Calculator(); - Main
//var result1 = calculator.add(1, 2);
//var result2 = calculator.subtract(4, 2);
//var result3 = calculator.divide(10, 5);
//var result4 = calculator.multiply(2, 2);
//
//System.out.println(result1);
//System.out.println(result2);
//System.out.println(result3);
//System.out.println(result4);
//System.out.println(calculator.getHistory());