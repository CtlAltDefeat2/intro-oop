package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public class Square extends Shape{
    //
    //Data Members
    //
    private int size;
    private ArrayList<String> sizeList;


    //
    //Constructors
    //
    Square(){}
    Square(int size){
        this.size = size;
        ArrayList sizeList = new ArrayList<String>(size);
        this.sizeList = sizeList;

    }

    //
    //Overrides
    //
    @Override
    String draw(){
        String listString = String.join(", ", sizeList);
        return listString;
    }

    Shape add(Shape square){
        this.shapes.add(square);
        return square;
    }

    //
    //Methods
    //
    private ArrayList buildList(){
        ArrayList sizeList = new ArrayList();
        for (int i = 0; i < sizeList.size() ; i++){
            sizeList.add("*");
        }
        this.sizeList = sizeList;
        return sizeList;
    }







}
