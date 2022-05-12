package com.xpanxion.myapp.student22;

public class Invoices {
    private S3BillingCalculator sB3BillingCalculator;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public Invoices(int userId, S3BillingCalculator sB3BillingCalculator) {
        this.sB3BillingCalculator = sB3BillingCalculator;
        this.userId =userId;
    }

    public Invoices() {
    }

    public Invoices(S3BillingCalculator sB3BillingCalculator) {
        this.sB3BillingCalculator = sB3BillingCalculator;
    }

    @Override
    public String toString() {
        return "UserId: "+ userId +"\n"+
                sB3BillingCalculator ;
    }
}
