package com.niantic.exercises;

import com.niantic.models.TestScore;

import java.util.ArrayList;
import java.util.Objects;

public class TestScores
{

    /*
    1.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a test - return all scores for the
        requested tests.
     */
    public ArrayList<TestScore> getScoresByTest(ArrayList<TestScore> testScores, String testName)

    {
        //Declare an arrayList to hold the output:
        ArrayList<TestScore> outputScores = new ArrayList<>();

        //For each test provided, add the test to our output list if it's
        //name matches the name provided.
        for (TestScore test : testScores)
        {
            if (Objects.equals(test.getTestName(), testName))
            {
                outputScores.add(test);
            }
        }

        return outputScores;
    }

    /*
    2.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores and the name of a student - return all scores for the
        requested student.
     */
    public ArrayList<TestScore> getScoresByStudent(ArrayList<TestScore> testScores, String student)
    {
        //Declare an arrayList to hold the output:
        ArrayList<TestScore> outputScores = new ArrayList<>();

        //For each test provided, add the test to our output list if the
        //student's name matches the name provided.
        for (TestScore test : testScores)
        {
            if (Objects.equals(test.getStudentName(), student))
            {
                outputScores.add(test);
            }
        }

        return outputScores;
    }

    /*
    3.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score.
     */
    public int getHighestScore(ArrayList<TestScore> testScores)
    {
        //Declare a variable to hold the highest number,
        //initializing that variable to the minimum integer value.
        int highestTest = Integer.MIN_VALUE;

        //For each provided number, assign it to highestValue if it's
        //higher than the current value:
        for (TestScore score : testScores)
        {
            if (score.getScore() > highestTest)
            {
                highestTest = score.getScore();
            }
        }
        return highestTest;
    }

    /*
    4.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score.
     */
    public int getLowestScore(ArrayList<TestScore> testScores)
    {
        //Declare a variable to hold the highest number,
        //initializing that variable to the minimum integer value.
        int lowestTest = Integer.MAX_VALUE;

        //For each provided number, assign it to highestValue if it's
        //higher than the current value:
        for (TestScore score : testScores)
        {
            if (score.getScore() < lowestTest)
            {
                lowestTest = score.getScore();
            }
        }

        return lowestTest;
    }

    /*
    5.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score.
     */
    public int getAverageScore(ArrayList<TestScore> testScores)
    {
        //Declare a variable to hold the average:
        int average = 0;

        //For each test score, add its value to the average variable:
        for (TestScore score : testScores)
        {
            average += score.getScore();
        }

        //Divide this sum by the amount of scores provided
        // to find the average:
        average = average / testScores.size();

        return average;
    }

    /*
    6.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified test name.
     */
    public int getHighestScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        //Declare an arrayList to hold the scores sorted by test, and an
        // integer to hold the highest score itself:
        ArrayList<TestScore> scoresByTest = new ArrayList<TestScore>();
        int outputScore = 0;

        //Use the above methods to sort the tests by name and filter for the
        //highest score:
        scoresByTest = getScoresByTest(testScores, testName);
        outputScore = getHighestScore(scoresByTest);

        return outputScore;
    }

    /*
    7.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified test name.
     */
    public int getLowestScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        //Declare an arrayList to hold the scores sorted by test, and an
        //integer to hold the lowest score itself:
        ArrayList<TestScore> scoresByTest = new ArrayList<TestScore>();
        int outputScore = 0;

        //Use the above methods to sort the tests by name and filter for the
        //lowest score:
        scoresByTest = getScoresByTest(testScores, testName);
        outputScore = getLowestScore(scoresByTest);

        return outputScore;
    }

    /*
    8.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified test name.
     */
    public int getAverageScoreByTest(ArrayList<TestScore> testScores, String testName)
    {
        //Declare an arrayList to hold the scores sorted by test, and an
        //integer to hold the average score itself:
        ArrayList<TestScore> scoresByTest = new ArrayList<TestScore>();
        int outputScore = 0;

        //Use the above methods to sort the tests by name and calculate the
        //average score:
        scoresByTest = getScoresByTest(testScores, testName);
        outputScore = getAverageScore(scoresByTest);

        return outputScore;
    }

    /*
    9.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the highest score for the specified student.
     */
    public int getHighestScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        //Declare an arrayList to hold the scores sorted by student, and an
        //integer to hold the highest score itself:
        ArrayList<TestScore> scoresByStudent = new ArrayList<TestScore>();
        int outputScore = 0;

        //Use the above methods to sort the tests by name and filter for the
        //highest score:
        scoresByStudent = getScoresByStudent(testScores, student);
        outputScore = getHighestScore(scoresByStudent);

        return outputScore;
    }

    /*
    10.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the lowest score for the specified student.
     */
    public int getLowestScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        //Declare an arrayList to hold the scores sorted by student, and an
        //integer to hold the lowest score itself:
        ArrayList<TestScore> scoresByStudent = new ArrayList<TestScore>();
        int outputScore = 0;

        //Use the above methods to sort the tests by name and filter for the
        //lowest score:
        scoresByStudent = getScoresByStudent(testScores, student);
        outputScore = getLowestScore(scoresByStudent);

        return outputScore;
    }

    /*
    11.  An ArrayList of TestScores contains test results for all students and all of their tests
        Given an input of All testScores return the average score for the specified student.
     */
    public int getAverageScoreByStudent(ArrayList<TestScore> testScores, String student)
    {
        //Declare an arrayList to hold the scores sorted by student, and an
        //integer to hold the calculated average:
        ArrayList<TestScore> scoresByStudent = new ArrayList<TestScore>();
        int outputScore = 0;

        //Use the above methods to sort the tests by name and calculate the
        //average score:
        scoresByStudent = getScoresByStudent(testScores, student);
        outputScore = getAverageScore(scoresByStudent);

        return outputScore;
    }
}
