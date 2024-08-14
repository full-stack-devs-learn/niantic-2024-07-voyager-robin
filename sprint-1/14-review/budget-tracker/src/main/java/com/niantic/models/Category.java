package com.niantic.models;

import java.util.ArrayList;

public class Category
{
    //Declare private variables:
    private int categoryId;
    private String categoryName;
    private String categoryDescription;
    private ArrayList<SubCategory> subCategories;
    //Declare constructors:
    public Category()
    {}
    public Category(int queryId, String queryName,
                    String queryDescription)
    {
        categoryId          = queryId;
        categoryName        = queryName;
        categoryDescription = queryDescription;
    }

    //Declare getters and setters:

    public int getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription()
    {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription)
    {
        this.categoryDescription = categoryDescription;
    }

    public ArrayList<SubCategory> getSubCategories() {
        return subCategories;
    }
}
