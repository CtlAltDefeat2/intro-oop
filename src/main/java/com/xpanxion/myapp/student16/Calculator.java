package com.xpanxion.myapp.student16;

import java.util.ArrayList;

//Abstraction is the class and the interface "Calculable" notice "able" is in all interfaces
public class Calculator implements Calculable { //implements is an inheritance.
    private ArrayList history = new ArrayList(); //Encapsulation is private, public, default, protective.
    @Override //polymorphism
    public Integer add(Integer number1, Integer number2) {
       int sum = number1 + number2;
       String result = number1 + " + " + number2 + " = " + sum + " \n ";
       this.history.add(result);
       return sum;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        int sum = number1 - number2;
        String result = number1 + " - " + number2 + " = " + sum + " \n ";
        this.history.add(result);
        return sum;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        int sum = number1 * number2;
        String result = number1 + " * " + number2 + " = " + sum + " \n ";
        this.history.add(result);
        return sum;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        int sum = number1 / number2;
        String result = number1 + " / " + number2 + " = " + sum + " \n ";
        this.history.add(result);
        return sum;
    }

    @Override
    public ArrayList<String> getHistory() {
        ArrayList arrayList = new ArrayList( );

        return history;
    }
}
    //         3
   //           2
  //           2
  //          4
  //          1 + 2 = 3
    //          4 - 2 = 2
    //         10 / 5 = 2
   //         2 * 2 = 4
