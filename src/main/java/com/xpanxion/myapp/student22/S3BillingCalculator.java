package com.xpanxion.myapp.student22;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;

public class S3BillingCalculator implements S3Calculatable {
    private Float price;
    private Float costPer1000PRequest;// put request
    private Float costPer1000GRequest;// get request
    private float tPrice;
    private float retVal;
    private float totalPrice;


    NumberFormat formatter = NumberFormat.getCurrencyInstance();




    HashMap<Integer,Integer> billingInfo = new HashMap<>();

    public Float getPrice() {
        return price;
    }

    public Float getCostPer1000PRequest() {
        return costPer1000PRequest;
    }

    public Float getCostPer1000GRequest() {
        return costPer1000GRequest;
    }

    public HashMap<Integer, Integer> getBillingInfo() {
        return billingInfo;
    }

    public S3BillingCalculator() { //default constructor
    }

    public S3BillingCalculator(Float price, Float costPer1000PRequest, Float costPer1000GRequest) {
        this.price = price;
        this.costPer1000PRequest = costPer1000PRequest;
        this.costPer1000GRequest = costPer1000GRequest;
    }


    @Override
    public void addStorageGB(int userId, int amount) {
         price = getPrice() * amount;
         System.out.println("UserID :" + userId);
        System.out.println("Stroge : " + formatter.format(price) );
        this.billingInfo.put(userId, amount);
    }

    @Override
    public void addPutRequest(int userId, int number) {
        this.billingInfo.put(userId, number);
        this.tPrice = tPrice;
        if(number <= 1000){
            tPrice = 0.25F;
        }
        else  {
           tPrice  = 0.25F * 2;

        }

        System.out.println("PUT request" + formatter.format(tPrice));


    }

    @Override
    public void addGetRequest(int userId, int number) {
     if(number <= 1000){
         retVal = costPer1000GRequest;
     }
     else {
         retVal = costPer1000GRequest * 2;

     }
        this.billingInfo.put(userId, number);
        System.out.println("Get Request" + formatter.format(retVal));
    }
   public Float getTotal(){
        float theTotal = tPrice + getPrice() + retVal;
        return theTotal;

   }

    @Override
    public Invoices createInvoice(int userId) {
        Invoices invoices = new Invoices(userId,this);
        return invoices;
    }

    @Override
    public String toString() {
        return "Storage :" +formatter.format(price)  + "\n" +
                "Get Request :" + formatter.format(costPer1000GRequest) + "\n"+
                "Put Request: " + formatter.format(costPer1000PRequest) +"\n" +
                "Total Cost is :"+formatter.format(getTotal());
    }
}
