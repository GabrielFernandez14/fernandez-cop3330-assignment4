/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// This class handles all item additions to the current list
package ucf.assignments;

import javafx.fxml.FXML;

import java.time.LocalDate;

public class AddItems {

    // private values for the following:
    // description: String
    // date: LocalDate
    // complete: boolean

    // PUBLIC completedItems: ArrayList<String>

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

    @FXML
    // This will need to be an fx:id
    public boolean itemMarkedComplete() {
        // If the user has double clicked an item
        // the program will recognize it as complete
        // shade the item's TextField to indicate as complete

        // Mark current item as complete
        // Call storeCompletedItem()
        // return true

        return true;
    }

    public void storeCompletedItem() {
        // Store the date and description into the ArrayList
        // This will allow for display of completed items to be much easier
        // as we will have a ready to go list of completed items
    }

}
