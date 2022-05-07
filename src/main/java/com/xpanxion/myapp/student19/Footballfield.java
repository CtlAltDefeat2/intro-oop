package com.xpanxion.myapp.student19;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Footballfield implements Registrable{
    private ArrayList<String> fields = new ArrayList<String>();
    private ArrayList<Date>  dates1 = new ArrayList<Date>(); //Fellowship Fields
    private ArrayList<Date> dates2 = new ArrayList<Date>(); //Valley Forge Fields
    private String s1 = "";
    private String s2 = "";
    private String s3 = "";

    public Footballfield(){
        fields.add("Fellowship Fields");
        fields.add("Valley Forge Fields");
        }

    public String isAvailable(String field, Date day){
        s1 = field + " is available on :" + day;
        if (dates1.size() != 0)
         {
            for (Date f: dates1){
                if (f == day) {
                        s1 = field + " is not available on: " + day;
                        break;
                }
            }
        }
        return s1;
    }
    public  String makeReservation(String field, Date day){
        dates1.add(day);
        return field + " -- Made Reservation on: " + day;
    }
    public  String cancelReservation(String field, Date day){
        dates1.remove(day);
        return field + " -- Canceled Reservation on: " + day;

    }


}
