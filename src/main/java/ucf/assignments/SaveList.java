/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// Responsible for saving the current list or multiple lists
// depending on the user's selections of the ComboBox
package ucf.assignments;

public class SaveList {
    // get selected ComboBox item as a param
    public void saveCurList() {
        // Save the selected list by checking to see which list
        // was clicked on in the ComboBox

        // Create a new .txt file of the name given by the item that was clicked in the ComboBox

        // if: folder "ToDoList" exists?
        //      store .txt inside of this folder
        // else:
        //      create folder "ToDoList" on the user's desktop
        //      with an appropriate path and then store the .txt
        //      inside
    }

    public void saveAllLists() {
        // The user has clicked the "Save All" method

        // if: folder "ToDoList" exists?
            // Get all lists and their corresponding items via a while loop that loops
            // through the ComboBox's values and creates .txt files for each list
            // Create a new .txt of name list
            //      This will need some sort of nested loop, the outer looping through the lists
            //      and the inner looping through the items of that list
            //      Store inside of the current .txt
            // Close the .txt
        // else: create "ToDoList" folder
            // Get all lists and their corresponding items via a while loop that loops
            // through the ComboBox's values and creates .txt files for each list
            // Create a new .txt of name list
            //      This will need some sort of nested loop, the outer looping through the lists
            //      and the inner looping through the items of that list
            //      Store inside of the current .txt
            // Close the .txt
    }
}
