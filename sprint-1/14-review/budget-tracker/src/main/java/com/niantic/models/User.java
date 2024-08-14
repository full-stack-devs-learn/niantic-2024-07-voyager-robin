package com.niantic.models;

import java.util.ArrayList;

//Create a class to hold Users:
public class User
{
    //Declare private variables:
    private int userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<Transaction> transactions;

    //Declare constructors, with and without arguments:
    public User()
    {}

    public User(int queryId, String queryUserName,
                String queryFirstName, String queryLastName,
                String queryPhone, String queryEmail)
    {
        userId = queryId;
        userName   = queryUserName;
        firstName  = queryFirstName;
        lastName   = queryLastName;
        phone      = queryPhone;
        email      = queryEmail;
    }

    //Declare getters and setters:
    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
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
