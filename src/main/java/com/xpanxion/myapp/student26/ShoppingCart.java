package com.xpanxion.myapp.student26;

import java.util.ArrayList;



public class ShoppingCart  {

 private ArrayList <Item> items;
 private float sum;
 public ShoppingCart() {

  items = new ArrayList<Item>();
 }
 public void addItem(Item i) {
  items.add(i);
 }
 public void calculateTotal () {

  for (int i = 0; i < items.size(); i++) {
   sum = sum + ((items.get(i).getPrice()) * (items.get(i).getQuantity()));
  }
 }
 public float getTotal() {
  return sum;
 }

}




