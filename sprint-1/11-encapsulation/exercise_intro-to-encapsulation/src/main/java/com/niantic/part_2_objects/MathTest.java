package com.niantic.part_2_objects;

public class MathTest
{
    //Declare private variables:
    private int score;
    private int possiblePoints;
    private String studentName;

    //Declare public constructor:
    public MathTest(int possiblePoints, String studentName)
    {
        this.possiblePoints = possiblePoints;
        this.studentName    = studentName;
    }

    //Declare getters and setters:
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPossiblePoints() {
        return possiblePoints;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getLetterGrade()
    {
        if (getPercent() >= 90)
        {
            return "A";
        }
        else if (getPercent() >= 80)
        {
            return "B";
        }
        else if (getPercent() >= 70)
        {
            return "C";
        }
        else if (getPercent() >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public int getPercent()
    {
        return 100 * score / possiblePoints;
    }
}