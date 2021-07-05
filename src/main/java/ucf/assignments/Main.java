/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

// Don't be surprised when my actual method is completely different from this,
// because to be completely honest this is complete garbage that I don't think would actually work
// My brain no do the think good

// :)

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDoList.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("To Do List Creator");
            primaryStage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
