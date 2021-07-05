/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// Responsible for everything concerning the items inside of a list
// (Adding or removing, NOT EDITING)
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
        // return correctly formatted date (YYYY-MM-DD) value + description
        return "";
    }

    @FXML
    // This will need to be an fx:id
    public boolean itemMarkedComplete() {
        // Call isDoubleClicked(), if returns true
        // the program will recognize it as complete
        // shade the item's label to indicate as complete
        // (will need an fx:id variable and a controller function to do this)

        // Mark current item as complete
        // Call storeCompletedItem()
        // return true

        return true;
    }

    @FXML
    public boolean isDoubleClicked() {
        // If this function is entered, the user double clicked on an item
        // return true

        return true;
    }

    // Pass the selected item as a param
    public void storeCompletedItem() {
        // Store the date and description into the ArrayList completedItems
        // via .append()
        // This will allow for display of completed items to be much easier
        // as we will have a ready to go list of completed items that is public
    }

    public void removeItem() {
        // Use an alert and prompt the user to select the item they want to remove
        // (if they haven't already selected one)

        // get the String of the item at the selected ListView index
        // Set the string to ""
        // (This may cause issues since it doesn't really reformat at all, but it's
        // still deleting it I guess?)
    }

}
