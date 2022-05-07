package com.xpanxion.myapp.student19;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public interface Registrable {
    String isAvailable(String field, Date day);
    String makeReservation(String field, Date day);
    String cancelReservation(String field, Date day);
}
