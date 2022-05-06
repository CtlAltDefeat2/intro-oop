package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public class Square extends Shape{
    //
    //Data Members
    //
    private int size;
    private ArrayList<ArrayList<String>> sizeList = new ArrayList<>();


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
    String draw() {
        int i = 0;
        int j = 0;
        String result = "";
        for (i = 1; i <= size; i++) {

            for (j = 0; j < size; j++) {
                if( i == 1 || i == size || j == 0 || j == size - 1) {
                    result += "*";
                }
                else{
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

    Shape add(Shape square){
        this.shapes.add(square);
        return square;
    }

    //
    //Methods
    //
    private void buildList(ArrayList sizeList) {
    }



}
