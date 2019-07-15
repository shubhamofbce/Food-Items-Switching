package com.example.foodgridrecyclerview;

public class FoodItems {
    String ItemName,Price;

    public FoodItems(String itemName, String price) {
        ItemName = itemName;
        Price = price;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getPrice() {
        return Price;
    }
}
