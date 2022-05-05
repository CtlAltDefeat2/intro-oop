package com.xpanxion.myapp.student23;

import java.util.ArrayList;

public class Calculator implements Calculatable {
    //define attributes

  public ArrayList<String> history = new ArrayList<String>();



    //define constructors
    public Calculator() {

    }

    @Override
    public Integer add(Integer number1, Integer number2) {
        Integer result;
        result = number1 + number2;
        history.add(number1+" + "+number2+" = "+ result );
        return result;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        Integer result;
        if(number1>number2) {
            result = number1 - number2;
            history.add(number1+" - " +number2 + " = "+ result);
            return result;
        }
        else{
            result=number2 - number1;
            history.add(number2+" - " +number1 + " = "+ result);
            return result ;
        }
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        Integer result;
        result = number1 * number2;
        history.add(number1+" * " +number2 + " = "+ result);
        return result;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        Integer result;
        result = number1/number2;
        history.add(number1+" / " +number2 + " = "+ result);
        return result;
    }

    public String getHistory() {
        String history1 = "";

        for(int i=0; i< history.size();i++){
            history1 += history.get(i) + "\n";
        }
        return history1;
    }

}
