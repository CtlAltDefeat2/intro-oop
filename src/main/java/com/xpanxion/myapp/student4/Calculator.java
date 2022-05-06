package com.xpanxion.myapp.student4;

import java.util.ArrayList;

public class Calculator implements calculatable {

   //
   // Data members
   //

   private ArrayList<String> calculate;

   //
   // Constructors
   //

   public Calculator() {
      calculate = new ArrayList<String>();
   }

   //
   // Overrides
   //

   @Override
   public Integer add(Integer number1, Integer number2) {
      int sum = number1 + number2;
      String addition = number1 + " +" + number2 + " = " + sum;
      calculate.add(addition);
      return sum;
   }


   @Override
   public Integer subtract(Integer number1, Integer number2) {
      int subs = number1 - number2;
      String substr = number1 + " -" + number2 + " = " + subs;
      calculate.add(substr);
      return subs;

   }

   @Override
   public Integer multiply(Integer number1, Integer number2) {
      int multi = number1 * number2;
      String multiplication = number1 + " *" + number2 + " = " + multi;
      calculate.add(multiplication);
      return multi;
   }

   @Override
   public Integer divide(Integer number1, Integer number2) {
      int division = number1 / number2;
      String divis = number1 + " /" + number2 + " = " + division;
      calculate.add(divis);
      return division;

   }

   @Override
   public String getHistory() {
      String retVal = "";
      for (String i : calculate) {
         System.out.println(i);;


      }


      return retVal;
   }
}
