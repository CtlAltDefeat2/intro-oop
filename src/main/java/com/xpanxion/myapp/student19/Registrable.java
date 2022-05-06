package com.xpanxion.myapp.student19;
import java.util.ArrayList;
public interface Registrable {
    boolean isAvailable(String field, double day);
    String makeReservation(String field, double day);
     String cancelReservation(String field, double day);

}
