/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

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
    }

    @FXML
    public void displayAllItems(ActionEvent actionEvent) {
    }

    @FXML
    public void displayComplete(ActionEvent actionEvent) {
    }

    @FXML
    public void displayIncomplete(ActionEvent actionEvent) {
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
        // this.date = call editDate function inside Class (pass date as a param)
    }

    @FXML
    public void changeItemDescription(ActionEvent actionEvent) {
        // Create a new instance of Class EditList
        // this.description = call editDescription function inside Class (pass selected description as a param)
    }

    @FXML
    public void listDisplayClicked(ActionEvent actionEvent) {
    }
}
