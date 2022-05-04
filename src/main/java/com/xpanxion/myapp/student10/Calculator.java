package com.xpanxion.myapp.student10;

import java.util.ArrayList;

public class Calculator implements Calculatable {
    private Integer numberone;
    private Integer numbertwo;
    private ArrayList history = new ArrayList();


    public Calculator(int numberone, int numbertwo) {
        this.numberone = numberone;
        this.numbertwo = numbertwo;
    }

    public Integer add(Integer numberone, Integer numbertwo){
        int sum = numberone + numbertwo;
        String math = numberone + "" + numbertwo + sum;
        this.history.add(math);
        return sum;
    }

    public Integer subtract(Integer numberone, Integer numbertwo){

    }
}
