package com.xpanxion.myapp.student12;

import java.util.ListIterator;

public class Tomato extends Garden {
    //
    //Data Members
    //
    private double spaceNeed = 1; //1sqFt

    //
    //Constructors
    //
    Tomato(){

    }
    Tomato(String variety, String growingSeason, int numberPlant, int seasonLength){
        this.variety = variety;
        this.growingSeason = growingSeason;
        this.numberPlant = numberPlant;
        this.seasonLength = seasonLength;

    }

    //
    //Overriders
    //
    public void add(Tomato tomato){
        this.veg.add(tomato);

    }

    String checkDate() {
        ListIterator<Garden> iterator1 = veg.listIterator();
        var result = "";
        while (iterator1.hasNext()) {
            for (int i = 0; i < veg.size(); i++) {
                veg2  = iterator1.next();
                varietyList.add(veg2.getVariety());
                growSeasList.add(veg2.getGrowingSeason());
                numList.add(veg2.getNumberPlant());
                lengthList.add(veg2.getSeasonLength());

                var sprDate = ("March," + 15);
                var sumDate = ("May," + 10);

                if (growingSeason == "spring") {
                    result +=  "Start date:" + sprDate;
                }
                else
                    result += "Start date: " + sumDate;
            }
        }
        return result;

    }

    //
    //Accessors
    //

    public double getSpaceNeed() {
        return spaceNeed;
    }
}
