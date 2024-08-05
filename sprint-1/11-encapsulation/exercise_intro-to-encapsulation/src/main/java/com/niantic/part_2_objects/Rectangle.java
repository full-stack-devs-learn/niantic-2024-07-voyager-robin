package com.niantic.part_2_objects;

public class Rectangle
{
    //Declare private variables:
    private int width;
    private int height;

    //Declare public constructors:
    public Rectangle()
    {
        this.width  = 0;
        this.height = 0;
    }
    public Rectangle(int width, int height)
    {
        this.width  = width;
        this.height = height;
    }

    //Declare public getters and setters:
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    //Declare method to calculate area:
    public int getArea()
    {
        return width * height;
    }
}
