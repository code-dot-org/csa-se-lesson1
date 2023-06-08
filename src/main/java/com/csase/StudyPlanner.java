package com.csase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/*
 * Represents a study planner with a list of assignments
 */
public class StudyPlanner {

    private ArrayList<Assignment> assignments;      // list of assignments
    private String[] options;                       // list of options

    /*
     * Sets assignments and options
     */
    public StudyPlanner() {
        assignments = new ArrayList<Assignment>();
        options = new String[]{"1. Add Assignment", "2. List Assignments", "3. Exit"};
    }

    /*
     * Returns list of assignments
     */
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    /*
     * Adds a new assignment to the list of assignments
     */
    public void addAssignment(String name, String dueDateString) {
        LocalDate dueDate = LocalDate.parse(dueDateString, DateTimeFormatter.ISO_LOCAL_DATE);
        assignments.add(new Assignment(name, dueDate));
    }

    /*
     * Returns string representation of assignments
     */
    public String listAssignments() {
        String assignmentsString = "";

        if (assignments.size() == 0) {
            return "No assignments to list!\n";
        }

        for (Assignment assignment : assignments) {
            assignmentsString += assignment.toString() + "\n";
        }

        return assignmentsString;
    }

    /*
     * Returns string representation of options
     */
    public String getOptions() {
        String optionsString = "";

        for (String option : options) {
            optionsString += option + "\n";
        }

        return optionsString;
    }
}
