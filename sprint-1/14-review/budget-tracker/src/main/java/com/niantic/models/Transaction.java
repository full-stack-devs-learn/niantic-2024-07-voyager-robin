package com.niantic.models;

import java.time.LocalDate;

public class Transaction
{
    //Declare private variables:
    private int transactionId;
    private int userId;
    private int subCategoryId;
    private int vendorId;
    private LocalDate date;
    private double amount;

    //Declare constructors:
    public Transaction()
    {}

    public Transaction(int queryTransactionId, int queryUserId,
                       int querySubCategoryId, int queryVendorId,
                       LocalDate queryDate, double queryAmount)
    {
        transactionId = queryTransactionId;
        userId        = queryUserId;
        subCategoryId = querySubCategoryId;
        vendorId      = queryVendorId;
        date          = queryDate;
        amount        = queryAmount;
    }

    //Declare getters and setters:
    public int getTransactionId()
    {
        return transactionId;
    }

    public void setTransactionId(int transactionId)
    {
        this.transactionId = transactionId;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public int getSubCategoryId()
    {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId)
    {
        this.subCategoryId = subCategoryId;
    }

    public int getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(int vendorId)
    {
        this.vendorId = vendorId;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
}
