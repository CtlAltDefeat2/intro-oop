package com.xpanxion.myapp.student19;

public class Footballfield implements Registrable{

    public Footballfield(){

    }

    public boolean isAvailable(String field, double day){
        return false;

    }
    public  String makeReservation(String field, double day){
        return "makeReservation";
    }
    public  String cancelReservation(String field, double day){
        return "cancelReservation";
    }


}
