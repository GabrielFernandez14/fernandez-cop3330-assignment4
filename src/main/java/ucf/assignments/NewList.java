/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// This class handles when a user wishes to create a new list
// and prompts the user for a name, and then adds the name to the ComboBox
package ucf.assignments;

// Import appropriate packages
import javafx.fxml.FXML;

public class NewList {
    // @FXML needed for the following:
    // private newListName: TextField
    // private isNewListClicked: boolean (init as false)

    /// PUBLIC allLists: ArrayList<String>

    // This function is called whenever the user creates a new list
    public void createNewList() {
        // listNameUpdated: boolean

        // if: listNameUpdated (call newListNamer()): is true?
        //      Call newListClicked()
        //      Call comboBoxInitializer()
        //      Set newListName equal to the item created by comboBoxInitializer()
    }

    public boolean newListNamer() {
        // Try-Catch in case there is an issue launching "NameList.fxml"

        // try
        //      Create a new instance of FXMLLoader
        //      set location of the loader to be to NameList.fxml
        //      Create a new instance of a dialogStage
        //      set the scene of the fxml
        //      set a stage modality
        //      set a stage owner for the scene
        //      set a title for the stage
        //      display the stage
        //      return true

        // catch IOException
        //      print stack trace
        //      return false

        // Arbitrary return value because rubric
        return true;
    }

    @FXML
    private void newListClicked() {
        // if: inputIsValid(): is true?
        //      Set newListName to whatever the user has inputted in the TextField
        //      Store newListName inside of allLists
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
}
