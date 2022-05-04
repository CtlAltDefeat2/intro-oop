package com.xpanxion.myapp.student10;

import java.util.ArrayList;

public class Calculator implements Calculatable {
    private Integer numberone;
    private Integer numbertwo;
    private ArrayList history = new ArrayList();


    public Calculator() {
        this.numberone = numberone;
        this.numbertwo = numbertwo;
    }

    @Override
    public Integer add(Integer numberone, Integer numbertwo) {
        this.numberone = numberone;
        this.numbertwo = numbertwo;
        int sum = numberone + numbertwo;
        String math = numberone + " + " + numbertwo + " = " + sum;
        this.history.add(math);
        return sum;
    }

    @Override
    public Integer subtract(Integer numberone, Integer numbertwo) {
        this.numberone = numberone;
        this.numbertwo = numbertwo;
        int difference = numberone - numbertwo;
        String math = "\n" + numberone + " - " + numbertwo + " = " + difference;
        this.history.add(math);
        return difference;
    }


    public Integer multiply(Integer numberone, Integer numbertwo) {
        this.numberone = numberone;
        this.numbertwo = numbertwo;
        int product = numberone * numbertwo;
        String math = "\n" + numberone + " * " + numbertwo + " = " + product;
        this.history.add(math);
        return product;
    }

    @Override
    public Integer divide(Integer numberone, Integer numbertwo) {
        this.numberone = numberone;
        this.numbertwo = numbertwo;
        int quotient = numberone / numbertwo;
        String math = "\n" + numberone + " / " + numbertwo + " = " + quotient;
        this.history.add(math);
        return quotient;
    }

    public ArrayList<String> getHistory(){
        return history;
    }
}
