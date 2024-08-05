package com.niantic.part_1_sakila_dtos;

import java.time.LocalDate;

public class Actor
{
    //Declare private variables:

    private int actorId;
    private String firstName;
    private String lastName;

    //Create both constructors:

    public Actor()
    {
        this.actorId   = 0;
        this.firstName = "";
        this.lastName  = "";
    }

    public Actor(int actorId, String firstName, String lastName) {
        this.actorId   = actorId;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    //Create public getter functions:

    public int getActorId()
    {
        return actorId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFullName()
    {
        return getFirstName() + " " + getLastName();
    }

    //Create public setter functions:

    public void setActorId(int actorId)
    {
        this.actorId = actorId;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
