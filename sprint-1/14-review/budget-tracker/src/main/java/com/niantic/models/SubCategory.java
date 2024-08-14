package com.niantic.models;

import java.util.ArrayList;

public class SubCategory
{
    //Declare private variables:
    private int subCategoryId;
    private int categoryId;
    private String subCategoryName;
    private String subCategoryDescription;
    private ArrayList<Transaction> transactions;

    //Declare constructors:
    public SubCategory()
    {}
    public SubCategory(int querySubCategoryId, int queryCategoryId,
                       String queryName, String queryDescription)
    {
        subCategoryId          = querySubCategoryId;
        categoryId             = queryCategoryId;
        subCategoryName        = queryName;
        subCategoryDescription = queryDescription;
    }

    //Declare getters and setters:

    public int getSubCategoryId()
    {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId)
    {
        this.subCategoryId = subCategoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getSubCategoryName()
    {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName)
    {
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryDescription()
    {
        return subCategoryDescription;
    }

    public void setSubCategoryDescription(String subCategoryDescription)
    {
        this.subCategoryDescription = subCategoryDescription;
    }

    public ArrayList<Transaction> getTransactions()
    {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions)
    {
        this.transactions = transactions;
    }
}
