package com.xpanxion.myapp.student19;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public interface Registrable {
    boolean isAvailable(String field, double day);
    String makeReservation(String field, double day);
     String cancelReservation(String field, double day);
}
