package com.niantic.part_1_sakila_dtos;

public class Film
{
    //Model the film class to hold the same values as the Film table in the Sakila database.
    //
    //All variables should be private and all variables should have public getters and setters.
    //
    //Constructors
    //Your class should have 2 constructors:
    //
    //A parameterless constructor that takes NO input parameters
    //A parameterized constructor that accepts all variables as input parameters.
    //Methods
    //This class should have no additional methods.

    //Declare private variables:
    private int filmId;
    private String title;
    private String description;
    private int releaseYear;
    private int languageId;
    private int rentalDuration;
    private double rentalRate;
    private int length;
    private double replacementCost;
    private String rating;
    private String specialFeatures;

    //Declare public constructors:
    public Film()
    {
        this.filmId          = 0;
        this.title           = "";
        this.description     = "";
        this.releaseYear     = 0;
        this.languageId      = 0;
        this.rentalDuration  = 0;
        this.rentalRate      = 0.0;
        this.length          = 0;
        this.replacementCost = 0.0;
        this.rating          = "";
        this.specialFeatures = "";
    }

    public Film(int filmId, String title, String description, int releaseYear, int languageId, int rentalDuration, double rentalRate, int length, double replacementCost, String rating, String specialFeatures) {
        this.filmId = filmId;
        this.title = title;
        this.description     = description;
        this.releaseYear     = releaseYear;
        this.languageId      = languageId;
        this.rentalDuration  = rentalDuration;
        this.rentalRate      = rentalRate;
        this.length          = length;
        this.replacementCost = replacementCost;
        this.rating          = rating;
        this.specialFeatures = specialFeatures;
    }

    //Declare public getters and setters:

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}
