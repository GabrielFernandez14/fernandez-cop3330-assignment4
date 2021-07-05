/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// Responsible for removing the selected list from the ToDoList App
package ucf.assignments;

public class RemoveList {

    // private selectedList: String

    public void removeCurList() {
        // Use an alert to prompt the user to select a List
        // (if one isn't already selected) in the ComboBox
        // that they want to remove and then reselect the
        // delete list Button inside of the Menu Bar

        // Get Selected list item using the ArrayList<String> allLists
        // Find the index of which the list is stored inside of the ArrayList
        // and delete that index

        // Remove the name as an option from the ComboBox by calling comboUpdater()

        // if: folder "ToDoList" on the user's desktop: exists?
            // if: .txt file of name list: exists?
            //      Delete the .txt file
            // else:
            //      Do nothing
    }

    public void comboUpdater() {
        // Reread the values inside of allLists and store inside the
        // ComboBox, this should effectively remove the list that was deleted
        // as an option by passing the updated ArrayList<String>
    }
}
