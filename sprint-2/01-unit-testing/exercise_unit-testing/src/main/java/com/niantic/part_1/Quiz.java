package com.niantic.part_1;

public class Quiz
{
    private int score;
    private final int possiblePoints;
    private final String studentName;

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        if (score < 0)
        {
            score = score * -1;
            System.out.println("Negative scores not accepted. Score set to: " + score);
        }
        this.score = score;
    }

    public int getPossiblePoints()
    {
        return possiblePoints;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public Quiz(int possiblePoints, String studentName)
    {
        if (possiblePoints <= 0)
        {
            possiblePoints = 100;
            System.out.println("Points possible cannot be zero or negative. " +
                               "Points possible set to: " + possiblePoints);
        }
        this.possiblePoints = possiblePoints;
        this.studentName = studentName;
    }

    public int getPercent()
    {
        return (int)((double)score / possiblePoints * 100);
    }

    public String getLetterGrade()
    {
        int percent = getPercent();

        if(percent >= 90) return "A";
        else if(percent >= 80) return "B";
        else if(percent >= 70) return "C";
        else if(percent >= 50) return "D";
        else return "F";
    }
}
