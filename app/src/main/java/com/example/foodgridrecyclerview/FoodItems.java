package com.example.foodgridrecyclerview;

public class FoodItems {
    String ItemName, Price;
    int itemCount;

    public String getItemName() {
        return ItemName;
    }

    public String getPrice() {
        return Price;
    }

    public int getItemCount() {
        return itemCount;
    }

    public FoodItems(String itemName, String price, int itemCount) {
        ItemName = itemName;
        Price = price;
        this.itemCount = itemCount;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
