/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// This class is responsible for loading the selected lists
// of the user given by the ComboBox
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class GetList {
    // private @FXML
    // Button loadButton (will be an fx:id)

    // private listsSelected: ArrayList<String>

    public void loadLists() {
        // Using an alert message, prompt the user on which
        // lists they'd like to open in the ComboBox

        // Allow the user to select their lists and
        // store each inside of listsSelected; check
        // if: loadButtonClicked: is true?
        //      while: ArrayList<String> listsSelected is not null
        //          try: .txt of list exists?
        //              Open .txt of current name allLists
        //          catch: IOException
        //              print stack trace and crash the program
    }

    @FXML
    public boolean loadButtonClicked(ActionEvent actionEvent) {
        // If the loadButton fx:id is clicked set isClicked as true
        // else return false

        // Arbitrary return value
        return true;
    }
}
