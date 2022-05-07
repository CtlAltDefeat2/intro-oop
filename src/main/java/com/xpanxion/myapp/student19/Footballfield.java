package com.xpanxion.myapp.student19;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Footballfield implements Registrable{
    public Footballfield(){
    }
    public boolean isAvailable(String field, double day){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return false;

    }
    public  String makeReservation(String field, double day){
        return "makeReservation";
    }
    public  String cancelReservation(String field, double day){
        return "cancelReservation";
    }


}
