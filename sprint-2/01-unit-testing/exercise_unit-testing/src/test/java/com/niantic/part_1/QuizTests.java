package com.niantic.part_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuizTests
{
    // Test that getPercentage calculates percentage correctly:
    @Test
    public void isPercentageCalculatedCorrectly()
    {
        // arrange; declare test values, actual & expected percentages:
        String testName;
        int    testScore;
        int    testPossiblePoints;
        int    expectedPercent;
        int    actualPercent;

        // act; create Quiz object with text parameters;
        //      calculate actual & expected percentage:
        testName           = "test";
        testPossiblePoints = 100;
        testScore          = 33;
        expectedPercent    = 33;

        Quiz testQuiz = new Quiz(testPossiblePoints, testName);
        testQuiz.setScore(testScore);

        actualPercent   = testQuiz.getPercent();

        // assert: test to see that the percent calculated is the percent expected.
        Assertions.assertEquals(expectedPercent, actualPercent, "Percentage score should equal" +
                                "score / possiblePoints * 100");
    }

    // Test that the letter grade is determined correctly:
    @Test
    public void isLetterGradeCorrect()
    {
        // arrange; declare test, expected, and actual values:
        String testName;
        int    testScore;
        int    testPossiblePoints;
        int    testPercent;
        String expectedLetterGrade;
        String actualLetterGrade;

        // act; create new Quiz with test values, determine expected and actual letter grade:
        testName           = "test";
        testScore          = 90;
        testPossiblePoints = 100;

        Quiz testQuiz = new Quiz(testPossiblePoints, testName);
        testQuiz.setScore(testScore);
        testPercent = testQuiz.getPercent();

        // Determine the expected grade:
        if(testPercent >= 90)
        {
            expectedLetterGrade = "A";
        }
        else if(testPercent >= 80)
        {
            expectedLetterGrade = "B";
        }
        else if(testPercent >= 70)
        {
            expectedLetterGrade = "C";
        }
        else if(testPercent >= 50)
        {
            expectedLetterGrade = "D";
        }
        else
        {
            expectedLetterGrade = "F";
        }

        //Determine the actual grade:
        actualLetterGrade = testQuiz.getLetterGrade();

        // assert; ensure that the expected and actual grade are the same:
        Assertions.assertEquals(expectedLetterGrade, actualLetterGrade);

    }

    // Test that possiblePoints is always positive:
    @Test
    public void isPossiblePointsPositive()
    {
        // arrange; Declare test, expected, and actual variables:
        String testName;
        int    testPossiblePoints;
        int    actualPossiblePoints;

        // act; create a new Quiz object with negative points possible, populate
        // expected and actual values:
        testName             = "test";
        testPossiblePoints   = -10;
        Quiz testQuiz        = new Quiz(testPossiblePoints,testName);
        actualPossiblePoints = testQuiz.getPossiblePoints();

        // assert; test that expected and actual values match:
        Assertions.assertTrue(actualPossiblePoints >= 0);
    }

    // Test that score is always positive:
    @Test
    public void isScorePositive()
    {
        // arrange; Declare test, expected, and actual variables:
        String testName;
        int    testScore;
        int    actualScore;

        // act; create a new Quiz object with negative score:
        testName      = "test";
        testScore     = -10;
        Quiz testQuiz = new Quiz(100,testName);
        testQuiz.setScore(testScore);

        actualScore = testQuiz.getScore();

        // assert; test that expected and actual values match:
        Assertions.assertTrue(actualScore >= 0);
    }

}