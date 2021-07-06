/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package ucf.assignments;

// More imports than this are going to be needed of course
import javafx.fxml.FXML;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddItemsTest {

    @Test
    void getDescription_test_for_arbitrary_value() {
        // set description TextField to predetermined expected values
        // get the values from description TextField
        // call the getDescription_test...() function and get the actual
        // Assert expected value is equal to the actual value
    }

    @Test
    void setDescription_test_that_set_method_works() {
        // set description TextField to predetermined expected values
        // call the setDescription_test...() function and get the actual
        // (Assert boolean) check that description TextField is set as the expected value
        // Assert expected value is equal to the actual value
    }

    @Test
    void getDate_test_for_today() {
        // set date DatePicker to predetermined expected values (today)
        // get the value from the DatePicker
        // call the getDate_test...() function and get the actual date
        // Assert actual date is today's date (the expected)
    }

    @Test
    void setDate_test_that_set_method_works() {
        // Create a DatePicker variable set as today
        // set date DatePicker to predetermined expected value (today)
        // call the setDate_test...() function and get the actual
        // (Assert boolean) check that date DatePicker is the same as the pre-existing var
        // Assert expected value is equal to the actual value
    }

    @Test
    void itemMarkedComplete_test_that_an_item_can_be_marked_completed() {
        // Create a new ArrayList<String>
        // append an item of string "YYYY-MM-DD\t\t\tGo to the store"

        // Create a new instance of class AddItems
        // Call isDoubleClickedTest() (but have it automatically return true)
        // Call storeCompletedItems()
        // Assert that the public ArrayList<String> of completedItems has a string
        // equal to the expected string
    }
    public boolean isDoubleClickedTest() {
        // return true
        return true;
    }

    @Test
    void removeItem_from_newly_created_list() {
        // Set expected item as string "YYYY-MM-DD\t\t\tGo to the library"
        // Use get/set methods from AddItems to add a few other items to the list

        // Create a new instance of class AddItems
        // Get the selected (expected) item in the ListView
        // Get all current items in the ListView using a loop
        // Call removeItem()

        // Assert that the expected string is now equal to ""
    }
}