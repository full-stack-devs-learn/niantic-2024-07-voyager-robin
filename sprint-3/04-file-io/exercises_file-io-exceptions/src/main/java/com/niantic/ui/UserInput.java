package com.niantic.ui;

import java.util.Scanner;

public class UserInput
{
    protected static Scanner in = new Scanner(System.in);

    public static int homeScreenSelection()
    {
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("-".repeat(30));
        System.out.println();
        System.out.println("  1) Display files");
        System.out.println();
        System.out.println("  ------------ Individual File ------------");
        System.out.println("  2) Student: display all scores");
        System.out.println("  3) Student: display average score");
        System.out.println();
        System.out.println("  ---------- Challenge All Files ----------");
        System.out.println("  5) All Students: display average score");
        System.out.println("  6) All Assignments: display average score");
        System.out.println();
        System.out.println("  0) Exit");

        System.out.println();
        System.out.print("Please make a selection: ");

        return Integer.parseInt(in.nextLine());
    }

    public static void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
    }

    public static String FileSelection()
    {
        String input;

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("Enter the Student Number for the report you would like to view:\n");
        System.out.println(" 1) Anna Williams");
        System.out.println(" 2) David Jones");
        System.out.println(" 3) Laura Brown");
        System.out.println(" 4) Eric Walker");
        System.out.println(" 5) Joshua Martin");

        input = in.nextLine();

        switch(input)
        {
            case "1":
                return "student_1_anna_williams.csv";
            case "2":
                return "student_2_david_jones.csv";
            case "3":
                return "student_3_laura_brown.csv";
            case "4":
                return "student_4_eric_walker.csv";
            case "5":
                return "student_5_joshua_martin.csv";
            default:
                return " ";
        }
    }
}
