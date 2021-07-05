/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// Controller class for the program
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    // Create private @FXML variables for the following:
    // (These will go into fx:id for their appropriate functions)
    //      Button addButton
    //      TextField descriptionTextField
    //      DatePicker datePicker
    //      ListView<AddItems> itemList

    @FXML
    public void newList(ActionEvent actionEvent) {
        // Create a new instance of Class "NewList"
        // Call the "createNewList()" function inside of NewList
    }

    @FXML
    public void saveCurList(ActionEvent actionEvent) {
        // Create a new instance of Class "SaveList"
        // Call the saveCurList() function inside of SaveList
    }

    @FXML
    public void saveAllLists(ActionEvent actionEvent) {
    }

    @FXML
    public void openLists(ActionEvent actionEvent) {
    }

    @FXML
    public void deleteList(ActionEvent actionEvent) {
    }

    @FXML
    public void renameList(ActionEvent actionEvent) {
        // Create a new instance of Class EditList
        // Call renameListClicked() function inside of Class EditList
    }

    @FXML
    public void displayAllItems(ActionEvent actionEvent) {
        // Create a new instance of Class "DisplayList"
        // Call the displayAll() function inside of displayList
    }

    @FXML
    public void displayComplete(ActionEvent actionEvent) {
        // Create a new instance of Class "DisplayList"
        // Call the displayComplete() function inside of displayList
    }

    @FXML
    public void displayIncomplete(ActionEvent actionEvent) {
        // Create a new instance of Class "DisplayList"
        // Call the displayIncomplete() function inside of displayList
    }

    @FXML
    public void newTaskClicked(ActionEvent actionEvent) {
        // Add a new instance of AddItems datePicker to the list and get the value + description
        // Set the items retrieved from the date and description to the eventList in the scene
        // Call refresh method
    }
    private void refresh() {
        // reset the value of datePicker to current date
        // reset the value of the description TextField to null
    }

    @FXML
    public void changeDate(ActionEvent actionEvent) {
        // Create a new instance of Class EditList
        // this.date = call editList function inside Class (pass date as a param)
    }

    @FXML
    public void changeItemDescription(ActionEvent actionEvent) {
        // Create a new instance of Class EditList
        // this.description = call editList function inside Class (pass selected description as a param)
    }

    // This function is pretty unnecessary, but is linked to the ListView
    // so needs to be reworked someway so that it cooperates better
    // with edits to list items
    @FXML
    public void listDisplayClicked(ActionEvent actionEvent) {
        // if: date: is clicked?
        //      Call changeDate()
        // if: itemDescription: is clicked()
        //      Call changeItemDescription()
    }
}
