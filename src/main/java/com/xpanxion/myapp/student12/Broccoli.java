package com.xpanxion.myapp.student12;

import java.util.ListIterator;

public class Broccoli extends Garden {
    //
    //Data Members
    //
    private double spaceNeed = .5;

    //
    //Constructors
    //
    Broccoli() {

    }

    Broccoli(String variety, String growingSeason, int spaceNeed, int seasonLength) {
        this.variety = variety;
        this.growingSeason = growingSeason;
        this.numberPlant = spaceNeed;
        this.seasonLength = seasonLength;

    }

    //
    //Overriders
    //
    public void add(Broccoli broccoli) {
        this.veg.add(broccoli);

    }

    String checkDate() {
        ListIterator<Garden> iterator1 = veg.listIterator();
        var result = "";
        while (iterator1.hasNext()) {
            for (int i = 0; i < veg.size(); i++) {
                veg2 = iterator1.next();
                varietyList.add(veg2.getVariety());
                growSeasList.add(veg2.getGrowingSeason());
                numList.add(veg2.getNumberPlant());
                lengthList.add(veg2.getSeasonLength());

                var sprDate = ("March," + 15);
                var sumDate = ("May," + 10);

                if (growingSeason == "spring") {
                    result += "Start date:" + sprDate;
                } else
                    result += "Start date: " + sumDate;
            }
        }
        return result;

        //
        //Methods
        //

        //returns the approximate start date for this seedling

    }
}
