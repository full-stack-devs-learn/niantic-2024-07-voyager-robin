package com.niantic.exercises;

import java.util.ArrayList;

public class ArrayListIntro
{
    /*
    1. Create an ArrayList of Strings and add the names of your
       5 favorite heroes.

    Return the list.
     */
    public ArrayList<String> getHeroesList()

    {
        ArrayList<String> heroesList = new ArrayList<String>();
        heroesList.add("Batman");
        heroesList.add("Marsha P. Johnson");
        heroesList.add("Robin Hood");
        heroesList.add("John Brown");
        heroesList.add("Frida Kahlo");

        return heroesList;
    }

    /*
    2. Given a list of integers, create and return a new list of just the
       even numbers in the list

       findEvens( [1, 2, 3, 4] )            ->  [2, 4]
       findEvens( [21, 98, 78, 5, 6, 8] )   ->  [98, 78, 6, 8]
     */
    public ArrayList<Integer> findEvens(ArrayList<Integer> numbers)

    {
        //Declare the array list to hold just the even numbers
        ArrayList<Integer> evensList = new ArrayList<Integer>();

        for (Integer number : numbers)
        {
            //Use the modulo operator on each number to determine
            //if its even:
            if (number % 2 == 0)
            {
                evensList.add(number);
            }
        }
        return evensList;
    }

    /*
    3. Given a list of integers, return the sum of all numbers

       sum( [1, 2, 3, 4] )            ->  10
       sum( [21, 98, 78, 5, 6, 8] )   ->  216
     */
    public int sum(ArrayList<Integer> numbers)
    {
        //Declare a variable to hold the result
        int sum = 0;

        //For each number provided, add it to the sum:
        for (Integer number : numbers)
        {
            sum += number;
        }

        return sum;
    }

    /*
    4. Given a list of integers, return the highest number

       sum( [1, 2, 3, 4] )            ->  4
       sum( [21, 98, 78, 5, 6, 8] )   ->  98
     */
    public int max(ArrayList<Integer> numbers)
    {
        //Declare a variable to hold the highest number,
        //initializing that variable to the minimum integer value.
        int highestValue = Integer.MIN_VALUE;

        //For each provided number, assign it to highestValue if it's
        //higher than the current value:
        for (Integer number : numbers)
        {
            if (number > highestValue)
            {
                highestValue = number;
            }
        }
        return highestValue;
    }

    /*
    5. Given a list of integers, return the lowest number

       sum( [1, 2, 3, 4] )            ->  1
       sum( [21, 98, -78, 5, 6, 8] )  ->  -78
     */
    public int min(ArrayList<Integer> numbers)
    {
        //Declare a variable to hold the lowest number,
        //initializing that variable to the maximum integer value.
        int lowestValue = Integer.MAX_VALUE;

        //For each provided number, assign it to lowestValue if it's
        //lower than the current value:
        for (Integer number : numbers)
        {
            if (number < lowestValue)
            {
                lowestValue = number;
            }
        }
        return lowestValue;
    }

    /*
    6. Given a list of integers, return the average of all numbers
       This should return the average as an integer, not a floating point

       sum( [3, 1, 59, -4, 81, 23] )    ->  27
       sum( [21, 98, -78, 5, 6, 8] )    ->  53
     */
    public int average(ArrayList<Integer> numbers)
    {
        //Declare a variable to hold the average:
        int average = 0;

        //Use the above sum function to find the sum of the
        //provided array list:
        average = sum(numbers);

        //Divide this sum by the amount of numbers in the
        //array list to find the average:
        average = average / numbers.size();

        return average;
    }

    /*
    7.  Build an arrayList that holds the fibonacci sequence

        The fibonacci sequence is a numeric pattern 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
        - each new number is added by calculating the sum of the previous 2 numbers
          0 + 1 = 1
          1 + 1 = 2
          1 + 2 = 3
          2 + 3 = 5
          etc.
        - the sequence must begin with 0, 1 so size will never be lower than 2

        Include as many numbers as is specified by the size input
     */
    public ArrayList<Integer> buildFibonacci(int size)
    {
        //Declare the array list to hold the sequence:
        ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        //Use the size specified by the user to populate
        //the rest of the sequence:
        for (int i = 2; i < size; i++)
        {
            int nextNumber = fibonacciSequence.get(i-2) + fibonacciSequence.get(i-1);
            fibonacciSequence.add(nextNumber);
        }

        return fibonacciSequence;
    }
}
