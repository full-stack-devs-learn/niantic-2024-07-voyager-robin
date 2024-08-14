package com.niantic.models;

import java.util.ArrayList;

public class Vendor
{
    //Declare private variables
    private int vendorId;
    private String vendorName;
    private String vendorWebsite;
    private ArrayList<Transaction> transactions;

    //Declare constructors
    public Vendor()
    {}

    public Vendor(int queryVendorId, String queryVendorName,
                  String queryWebsite)
    {
        vendorId      = queryVendorId;
        vendorName    = queryVendorName;
        vendorWebsite = queryWebsite;
    }

    //Declare getters and setters:


    public int getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(int vendorId)
    {
        this.vendorId = vendorId;
    }

    public String getVendorName()
    {
        return vendorName;
    }

    public void setVendorName(String vendorName)
    {
        this.vendorName = vendorName;
    }

    public String getVendorWebsite()
    {
        return vendorWebsite;
    }

    public void setVendorWebsite(String vendorWebsite)
    {
        this.vendorWebsite = vendorWebsite;
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
