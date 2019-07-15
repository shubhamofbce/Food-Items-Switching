package com.example.foodgridrecyclerview;


public class foodcategories {
    String CategoryName;
    int CategoryImage;

    public foodcategories(String categoryName, int categoryImage) {
        CategoryName = categoryName;
        CategoryImage = categoryImage;
    }

    public String getCategoryName() {
        return CategoryName;
    }
    public int getCategoryImage() {
        return CategoryImage;
    }

}
