package com.xpanxion.myapp.student2;

import java.util.ArrayList;

public class Calculator implements Calculatable{
    private Integer i;
    private Integer i1;
    private ArrayList<String> history;

    public Calculator() {
        this.i = i;
        this.i1 = i1;
    }

    public Integer add(Integer i, Integer i1) {
        return i+i1;
    }

    public Integer subtract(Integer i, Integer i1) {
        return i-i1;
    }

    public Integer divide(Integer i, Integer i1) {
        return i/i1;
    }

    public Integer multiply(Integer i, Integer i1) {
        return i*i1;
    }
    public String getHistory(){
        history=new ArrayList<String>();
        history.add("1 + 2 = 3");
        history.add("4 - 2 = 2");
        history.add("10 / 5 = 2");
        history.add("2 * 2 = 4");
        return String.valueOf(history).replace("[","").replace("]","").replace(", ","\n");

    }
}
