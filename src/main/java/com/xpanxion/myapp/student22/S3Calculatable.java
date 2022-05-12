package com.xpanxion.myapp.student22;

public interface S3Calculatable {
    void addStorageGB(int userId, int amount);
    void addPutRequest(int userId, int number);
    void addGetRequest(int userId, int number);
    Invoices createInvoice(int userId);
}
