package com.csase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Represents an assignment with a name and due date
 */
public class Assignment {
    
    private String name;            // name of assignment
    private LocalDate dueDate;      // due date of assignment

    /*
     * Sets name and due date of assignment
     */
    public Assignment(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    /*
     * Returns name of assignment
     */
    public String getName() {
        return this.name;
    }

    /*
     * Returns due date of assignment
     */
    public LocalDate getDueDate() {
        return this.dueDate;
    }

    /*
     * Sets name of assignment
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Sets due date of assignment
     */
    public void setDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /*
     * Returns string representation of assignment
     */
    public String toString() {
        return this.name + " (due: " + this.dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }

}
