package com.csase;

import java.util.Scanner;

/*
 * Represents a student that with a study planner
 */
public class Student {

    private StudyPlanner planner;       // study planner
    private Scanner scanner;            // scanner for user input

    /*
     * Sets study planner and scanner
     */
    public Student {
        planner = new StudyPlanner();
        scanner = new Scanner(System.in);
    }
    
    /*
     * Gets the student's choice and runs it until the student exits
     */
    public void getChoice() {
        int option = -1;

        while (option != 3) {
            System.out.println("Welcome to Study Planner!");
            System.out.println("What would you like to do?");
            System.out.println(planner.getOptions());
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            runChoice(option);
        }
    }

    /*
     * Runs the student's choice
     */
    public void runChoice(int option) {
        if (option == 1) {
            addAssignment();
        } else if (option == 2) {
            System.out.println(planner.listAssignments());
        } else if (option == 3) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid option!");
        }
    }

    /*
     * Adds a new assignment to the study planner
     */
    public void addAssignment() {
        System.out.print("Enter assignment name: ");
        String name = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();
        planner.addAssignment(name, dueDate);
    }
}
