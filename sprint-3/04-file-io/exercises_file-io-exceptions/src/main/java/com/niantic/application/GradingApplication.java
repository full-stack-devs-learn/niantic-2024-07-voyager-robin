package com.niantic.application;

import com.niantic.models.Assignment;
import com.niantic.services.GradesFileService;
import com.niantic.services.GradesService;
import com.niantic.ui.UserInput;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.round;

public class GradingApplication implements Runnable
{
    private GradesService gradesService = new GradesFileService();

    public void run()
    {
        while(true)
        {
            int choice = UserInput.homeScreenSelection();
            switch(choice)
            {
                case 1:
                    displayAllFiles();
                    break;
                case 2:
                    displayFileScores();
                    break;
                case 3:
                    displayStudentAverages();
                    break;
                case 4:
                    displayAllStudentStatistics();
                    break;
                case 5:
                    displayAssignmentStatistics();
                    break;
                case 0:
                    UserInput.displayMessage("Goodbye");
                    System.exit(0);
                default:
                    UserInput.displayMessage("Please make a valid selection");
            }
        }
    }

    private void displayAllFiles()
    {
        File filesDir = new File("files");

        if(filesDir.isDirectory())
        {
            List<String> fileNames = Arrays.stream(filesDir.list()).sorted().toList();

            System.out.println("-".repeat(30));
            System.out.println("List of Files:");
            System.out.println("-".repeat(14));
            for (String fileName : fileNames)
            {
                System.out.println(fileName);
            }
            System.out.println("-".repeat(30));
        }
        else
        {
            System.out.println("No files/ directory found!");
        }

    }

    private void displayFileScores()
    {
        String choice;
        File file;
        List<Assignment> assignments = new ArrayList<Assignment>();

        choice = "files/" + UserInput.FileSelection();
        file   = new File(choice);


        // Read from the chosen file:
        try(Scanner reader = new Scanner(file))
        {
            String studentName = parseStudentName(file.getName());

            // Skip the header line:
            reader.nextLine();
            // Run through each line after the header:
            while(reader.hasNextLine())
            {
                // Convert the contents of each line to an assignment object:
                var line = reader.nextLine();
                var columns = line.split(",");

                int assignmentIndex    = Integer.parseInt(columns[0]);
                String firstName       = columns[1];
                String lastName        = columns[2];
                String assignmentName  = columns[3];
                int assignmentScore    = Integer.parseInt(columns[4]);

                var assignmentObject = new Assignment(assignmentIndex, firstName,
                                        lastName, assignmentName, assignmentScore);
                // Add the assignment to the list
                assignments.add(assignmentObject);
            }

            // Print the output:
            System.out.println("-".repeat(30));
            System.out.println(studentName);
            System.out.println("-".repeat(studentName.length()));
            System.out.println("All Assignments:\n");
            for (Assignment assignment : assignments)
            {
                System.out.println(assignment);
            }
            System.out.println("-".repeat(30));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }

    private void displayStudentAverages()
    {
        String choice;
        File file;
        int lowScore     = 0;
        int highScore    = 0;
        double avgScore  = 0;
        List<Integer> assignmentScore = new ArrayList<>();

        choice = "files/" + UserInput.FileSelection();
        file   = new File(choice);


        // Read from the chosen file:
        try(Scanner reader = new Scanner(file))
        {
            String studentName = parseStudentName(file.getName());

            // Skip the header line:
            reader.nextLine();

            while(reader.hasNextLine())
            {
                var line = reader.nextLine();
                var columns = line.split(",");
                assignmentScore.add(Integer.parseInt(columns[4]));
            }

            lowScore  = assignmentScore.stream().min(Integer::compareTo).get();
            highScore = assignmentScore.stream().max(Integer::compareTo).get();
            avgScore  = assignmentScore.stream().mapToDouble(Integer::doubleValue)
                                       .average().getAsDouble();

            // Print the result:
            System.out.println("-".repeat(30));
            System.out.println(studentName);
            System.out.println("-".repeat(studentName.length()));
            System.out.println("Assignment Details:\n");
            System.out.println("High Score:    " + highScore);
            System.out.println("Low Score:     " + lowScore);
            System.out.println("Average Score: " + round(avgScore));
            System.out.println("-".repeat(30));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    private void displayAllStudentStatistics()
    {
        // todo: 4 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for all scores (low score, high score, average score, number of students, number of assignments)
    }

    private void displayAssignmentStatistics()
    {
        // todo: 5 - Optional / Challenge - load all scores from all student and all assignments
        // display the statistics for each assignment (assignment name, low score, high score, average score)
        // this one could take some time
    }

    private String parseStudentName(String fileName)
    {
        return fileName.replace(".csv", "")
                        .replace("_", " ")
                        .substring(10).toUpperCase();
    }
}
