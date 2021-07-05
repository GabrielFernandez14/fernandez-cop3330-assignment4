/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package ucf.assignments;

import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class EditList {

    // This class is kind of pointless honestly, just reuses stuff from the program
    // So probably will remove it in the final version

    // Private @FXML variables:
    // renameListName: TextField
    // itemDescription: TextField

    // This function is called whenever the user selects an existing list
    // then presses the appropriate edit menu item to rename the list that
    // is currently selected
    public void renameCurList() {
        // Try-Catch in case there is an issue launching "NameList.fxml"

        // try
            //      Create a new instance of FXMLLoader
            //      set location of the loader to be to NameList.fxml
            //      Create a new instance of a dialogStage
            //      Display the current list name in the text field
            //      (the one that the user had selected upon clicking rename list)

            //      set the scene of the fxml
            //      set a stage modality
            //      set a stage owner for the scene
            //      set a title for the stage
            //      display the stage
            //      return true
        // catch IOException
            //      print stack trace
            //      return false
    }

    @FXML
    private void renameListClicked() {
        // if: inputIsValid(): is true?
        //      Set renameListName to whatever the user has inputted in the TextField
        //      Set isOkayClicked to true
    }

    @FXML
    private boolean inputIsValid() {
        // errorMessage: String = ""

        // if: No input inside of text field OR length == 0
        //      Concatenate an appropriate error message to errorMessage
        // else:
        //      Validate that the user inputted a string into the textfield
        //      if: is String?
        //          Do nothing
        //      else:
        //          Concatenate an appropriate error message

        // if: errorMessage length == 0
        //      return true
        // else:
        //      Display the error message using an Alert dialogStage (which needs to be initialized)
        //      Set a header text and prompt the user to correct the following: (errorMessage)
        //      return false

        // Arbitrary return value
        return true;
    }

    @FXML
    private void comboBoxInitializer() {
        // Create a new ComboBox variable and initialize using .getItems()
        // Add a new selection using newListName
        // .getSelectionModel to have it display the current list
    }

    // Called whenever the user selects an item from the ListView to edit
    public void editList() {
        // if: itemDescription: is null?
        //      Display an alert to the user that this item does not exist, and they need to
        //      add an item to the list first
    }
}
