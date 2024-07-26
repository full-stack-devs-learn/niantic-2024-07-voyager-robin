package com.niantic;

import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);
    private static int[] scores = new int[0];

    public static void main(String[] args)
    {
        while(true)
        {
            int choice = getHomeSelection();

            switch(choice)
            {
                case 1:
                    scores = createNewTestScores();
                    break;
                case 2:
                    calculateAverage();
                    break;
                case 3:
                    findHighestScore();
                    break;
                case 4:
                    findLowestScore();
                    break;
                case 0:
                    System.out.println("Thanks for playing!");
                    System.out.println("Good bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection!");
                    break;
            }
        }
    }

    public static int getHomeSelection()
    {
        System.out.println();
        System.out.println("Welcome to Robin's Test Score App!");
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1) Enter new test scores");
        System.out.println("2) Calculate the class average");
        System.out.println("3) Find the highest score");
        System.out.println("4) Find the lowest score");
        System.out.println("0) Exit");

        System.out.print("Please select an option:");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int[] createNewTestScores()
    {
        //Declare variables to hold number of test scores and the scores themselves:
        int numberOfTests = 0;
        int[] testScores;

        //Query user for number of tests:
        System.out.println();
        System.out.println("How many tests are we evaluating?");
        numberOfTests = (userInput.nextInt());
        userInput.nextLine();
        System.out.println();

        //Size array using the length given by the user:
        testScores  = new int[numberOfTests];

        //Query user for test scores and enter scores into array:
        for (int i = 0; i < numberOfTests; i++)
        {
            System.out.println("Please enter the next test score:");
            testScores[i] = (userInput.nextInt());
            userInput.nextLine();
        }

        //Return the result:
        return testScores;
    }

    private static void calculateAverage()
    {
        int sum = 0;
        double average = 0.0;

        //Add together the test scores, then divide by the amount to find the average:
        for (int entry : scores)
        {
            sum += entry;
        }

        average = (double)sum / scores.length;

        //Output the result:
        System.out.println();
        System.out.println("The average score is: " + average);
    }

    private static void findHighestScore()
    {
        int highestScore = scores[0];

        //Loop through the scores array, replacing highestScore with any higher score:

        for (int entry : scores)
        {
            if (entry > highestScore)
            {
                highestScore = entry;
            }
        }


        //Output the result:
        System.out.println();
        System.out.println("The highest score is: " + highestScore);
    }

    private static void findLowestScore()
    {
        int lowestScore = scores[0];

        //Loop through the array, replacing lowestScore with any lower score:

        for (int entry : scores)
        {
            if (entry < lowestScore)
            {
                lowestScore = entry;
            }
        }

        //Print the result:
        System.out.println();
        System.out.println("The lowest score is: " + lowestScore);
    }
}