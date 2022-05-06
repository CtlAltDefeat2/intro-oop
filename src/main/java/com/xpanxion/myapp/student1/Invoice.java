package com.xpanxion.myapp.student1;

public class Invoice {

        private String name;
        private String streetAddress;
        private String city;
        private String state;
        private int zipCode;
        public Invoice(String name, String streetAddress, String city, String state, int zipCode) {
            this.name = name;
            this.streetAddress = streetAddress;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        @Override
        public String toString() {
            String retVal = " ";
            retVal = name + "\n" + streetAddress + "\n" + city + ", " + state + ", " + zipCode + "\n" + "\n" +
                    "Items" + "\n" + "_____" + "\n" + "Socks" + " " + "$2.00" + " " + "(4)" + " " + "$8.00" + "\n" + "Shirts" + " "
                    + "$10.00" + " " + "(2)" + " " + " $20.00" + "\n" + "\n" + "Shipping: Free" + "\n" + "Total Cost" + "\n" +
                    "________" + "\n" + "$28.00";
            return retVal;
        }
}

//    private String name;
//    private String streetAddress;
//    private String city;
//    private String state;
//    private int zipCode;
//
//    public Invoice(String name, String streetAddress, String city, String state, int zipCode) {
//        this.name = name;
//        this.streetAddress = streetAddress;
//        this.city = city;
//        this.state = state;
//        this.zipCode = zipCode;
//    }
//
//    @Override
//    public String toString() {
//        String retVal = " ";
//        retVal = name + "\n" + streetAddress + "\n" + city + ", " + state + ", "  + zipCode + "\n" + "\n"+
//                "Items"+ "\n"+"_____" + "\n" + "Socks" +" " + "$2.00" + " " + "(4)" + " " +"$8.00" + "\n" + "Shirts" + " "
//                + "$10.00" + " " + "(2)"+ " " + " $20.00" + "\n" + "\n" + "Shipping: Free" + "\n" + "Total Cost" + "\n"+
//                "________" + "\n" + "$28.00";
//        return retVal;
//    }
//}
//
//
//
