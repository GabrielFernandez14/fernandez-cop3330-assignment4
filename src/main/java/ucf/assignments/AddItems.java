/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// This class handles all item additions to the current list
package ucf.assignments;

import java.time.LocalDate;

public class AddItems {

    // private values for the following:
    // description: String
    // date: LocalDate

    // Getter for description
    public String getDescription() {
        return "";
    }

    // Setter for description (needs to pass in description as a param)
    public void setDescription() {
        // use "this" to differentiate between different descriptions
        // and set equal to description
    }

    // Getter for date
    public LocalDate getDate() {
        // return "date"
        return LocalDate.now();
    }

    // Setter for description (needs to pass in LocalDate date as a param)
    public void setDate() {
        // use "this" to differentiate between different dates
        // and set equal to date
    }

    // Pass date and description as params
    public AddItems() {
        // Set selected date and description as the items to be added
    }

    //@Override goes here
    public String formatString() {
        // return correctly formatted date value + description
        return "";
    }
}
