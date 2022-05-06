package com.xpanxion.myapp.student12;

import java.util.ArrayList;

public class Garden {
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
    public ArrayList veg = new ArrayList();



    public Garden veg2;
    public int sqFt;

    //
    //Constructors
    //
    Garden(){

    }
    Garden(int sqFt){
        this.sqFt = sqFt;
        this.veg = new ArrayList();
    }

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

    public ArrayList getVeg() {
        return veg;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    //
    //Overrides
    //

    @Override
    public String toString() {
        String listString = String.join(",",veg);
        return listString;


    }

}
