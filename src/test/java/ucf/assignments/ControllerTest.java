/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package ucf.assignments;

// Going to need a lot of imports
// Especially .scene.control.ComboBox...(etc.)
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void newList_test_that_a_new_list_is_created() {
        // Create a new class of NewList
        // Call createNewList()
        // Set the value of newListName to "abc"
        // Assert that the ComboBox of .getItems() has a
        // string equal to "abc"
    }

    @Test
    void saveCurList_test_that_an_existing_list_creates_a_txt() {
        // Create a new class of SaveList
        // Create a folder "ToDoListTest" on the user's desktop
        // Create a new Class of NewList
        // call createNewList() and set the newListName to "abc"
        // Call saveCurList()
        // Assert a file called "abc.txt" exists inside of folder "ToDoListTest"
    }

    @Test
    void saveAllLists_save_multiple_lists_to_txt_files() {
        // Create a new class of SaveList
        // Create a folder "ToDoListTest2" on the user's desktop
        // Create a new Class of NewList
        // call createNewList() and set the newListName to "abc"
        // call createNewList() again and set newListName to "def"
        // Call saveAllLists()
        // Assert that files called "abc.txt" and "def.txt" exists inside of folder "ToDoListTest2"
    }

    @Test
    void openLists_check_to_see_if_a_newly_created_list_opens_as_txt() {
        // Create a new class of GetList, SaveList, and NewList
        // call createNewList() and set the newListName to "Grocery"
        // call saveCurList() and save the "selected" list to a file in folder "ToDoListTest3"
        // (it's the only list that is created currently)
        // call loadLists() and force it to load the file Grocery.txt by passing in it's name
        // No assert is necessary, the test should be whether Grocery.txt is opened
    }

    @Test
    void deleteList_check_to_see_if_list_is_deleted_in_GUI() {
        // Create an ArrayList<String> called newListName
        // including "Chores"

        // Create a new class of NewList and DeleteList
        // call createNewList() and set the newListName to "Chores"
        // call removeCurList() and set the ComboBox item to Chores
        // Check the ComboBox ArrayList and assert that "Chores" is no
        // longer inside
    }

    @Test
    void renameList_assert_that_list_can_be_renamed() {
        // Create new classes of NewList and EditList
        // Call createNewList() and set newListName to "Hobbies"
        // Call renameCurList() (set renameListClicked() to true)
        // set renameListName to "Habbies"
        // assert that ComboBox current item name of ArrayList<String> is "Habbies"

    }

    @Test
    void displayAllItems_of_a_newly_created_list_with_1_item() {
        // Create new classes of NewList, AddItems and DisplayList
        // createNewList() and set newListName to "ICantThinkOfAnyMoreToDoLists"
        // call get and set methods for description and date, create one item of
        // "2021-07-05\t\t\tCry Yourself to Sleep"
        // call displayALl() inside of DisplayList
        // No assert necessary, check that a .txt window called "All To Dos"
        // is opened with "2021-07-05\t\t\tCry Yourself to Sleep" inside
    }

    @Test
    void displayComplete_of_a_newly_created_list_with_1_complete_item() {
        // Create new classes of NewList, AddItems and DisplayList
        // createNewList() and set newListName to "ICantThinkOfAnyMoreToDoLists2"
        // call get and set methods for description and date, create two items of
        // "2021-07-05\t\t\tCry Yourself to Sleep" and "2021-07-11\t\t\tCry After Receiving Your Grade"
        // call itemMarkedComplete() inside of AddItems (isDoubleClicked needs to be true)
        // pass in the string "2021-07-05\t\t\tCry Yourself to Sleep" to be marked complete and storeCompletedItem()
        // inside of the ArrayList<String>
        // call displayComplete() inside of DisplayList
        // No assert necessary, check that a .txt window called "Completed To Dos"
        // is opened with ONLY "2021-07-05\t\t\tCry Yourself to Sleep" inside
    }

    @Test
    void displayIncomplete_of_a_newly_created_list_with_1_incomplete_item() {
        // Create new classes of NewList, AddItems and DisplayList
        // createNewList() and set newListName to "ICantThinkOfAnyMoreToDoLists3"
        // call get and set methods for description and date, create two items of
        // "2021-07-05\t\t\tCry Yourself to Sleep" and "2021-07-11\t\t\tCry After Receiving Your Grade"
        // call itemMarkedComplete() inside of AddItems (isDoubleClicked needs to be true)
        // pass in the string "2021-07-05\t\t\tCry Yourself to Sleep" to be marked complete and storeCompletedItem()
        // inside of the ArrayList<String>
        // call displayComplete() inside of DisplayList
        // No assert necessary, check that a .txt window called "Completed To Dos"
        // is opened with ONLY "2021-07-05\t\t\tCry After Receiving Your Grade" inside
    }

    @Test
    void newTaskClicked_check_that_an_appropriate_string_is_added_to_the_ListView() {
        // Create new class of AddItems
        // Define an expected string to be "1865-04-15\t\t\tAssassinate the President"
        // using the get and set methods for description TextField and date DatePicker
        // Assert that newTaskClicked() creates an item of type String that matches
        // the expected string inside of the ListView by using a loop that crosschecks
        // that the string exists
    }

    @Test
    void changeDate_check_that_date_of_type_DatePicker_can_be_changed() {
        // Create a new class of AddItems
        // Define an expected date of date: DatePicker to be today
        // use getDate() and setDate() to set date to today using LocalDate.now()
        // assert that expected date is equal to LocalDate.now()
    }

    @Test
    void changeItemDescription() {
        // Create a new class of AddItems
        // Define an expected date of description: TextField to be "Being dumb"
        // use getDescription() and setDescription() to set the description to the expected value
        // assert that expected description String is equal to the return of setDescription(): TextField
    }

    @Test
    void removeAnItem() {
        // Create a new class of AddItems
        // Define an expected date and description to "YYYY-MM-DD\t\t\tInsert Description Here"
        // use getDescription(), getDate() and setDescription(), setDate() to set the description to the expected value
        // inside of a TextField
        // call removeItem() (set the ListView item to the only one in the list (our expected String))
        // Assert equals that the String item at location ListView is now equal to ""
    }
}