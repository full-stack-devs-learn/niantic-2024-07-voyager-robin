package com.niantic.part_2_objects;

public class Circle
{
    //Declare a private constant for Pi:
    private final double PI = Math.PI;
    //Declare private variable:
    private int radius;

    //Declare public constructors:
    public Circle()
    {
        this.radius = 0;
    }

    public Circle(int radius)
    {
        this.radius = radius;
    }

    //Declare public getters and setters:
    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return PI * Math.pow(radius, 2);
    }

    public double getCircumference()
    {
        return 2 * PI * radius;
    }

    public int getDiameter()
    {
        return radius * 2;
    }
}
