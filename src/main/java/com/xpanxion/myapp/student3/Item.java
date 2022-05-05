package com.xpanxion.myapp.student3;

public class Item {
   protected Float price;
    protected int quantity;
    protected String description;

    public Item(Float price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description=" + description +
                ", quantity=" + quantity +
                ", price='" + price + '\n' +
                '}';
    }
}
