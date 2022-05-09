package com.xpanxion.myapp.student12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public abstract class Vegetable {
    //
    //Data Members
    //
    public String variety;
    public ArrayList varietyList = new ArrayList();
    public String growingSeason;
    public ArrayList growSeasList = new ArrayList();
    public int numberPlant;
    public ArrayList numList = new ArrayList();
    public int seasonLength;
    public ArrayList lengthList = new ArrayList();
    public ArrayList<Vegetable> veg = new ArrayList();
    public Vegetable veg2;

    abstract Vegetable add(Vegetable vegetable);

    //
    //Constructors
    //

    //
    //Methods
    //


    //
    //Accessors
    //


    public String getVariety() {
        return variety;
    }

    public String getGrowingSeason() {
        return growingSeason;
    }

    public int getNumberPlant() {
        return numberPlant;
    }

    public int getSeasonLength() {
        return seasonLength;
    }

//    public ArrayList getVeg() {
//        return veg;
//    }


    //
    //Overrides
    //

    @Override
    public String toString() {
        String listString = veg.stream().map(Object::toString)
                .collect(Collectors.joining(", "));

        return listString;


    }

}
