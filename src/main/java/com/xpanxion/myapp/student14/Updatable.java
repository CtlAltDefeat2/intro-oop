package com.xpanxion.myapp.student14;

public interface Updatable {
    String name (String firstName, String lastName);
    String address (String streetAddress, String city, String state, String zipCode);
    String phoneNumber (String phone);

    String getBook();
}
