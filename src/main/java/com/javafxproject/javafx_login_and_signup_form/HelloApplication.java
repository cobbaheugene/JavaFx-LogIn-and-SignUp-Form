    //Notes:
    //In JavaFX, the fxml file allows us to create the appearance of the application
    //The Controller allows us to code in the widgets we made in our fxml file. For example,
    // an action to add a button when it is clicked.

    //You link the fxml file with the controller with the key fx:controller "..."
    //JDBC means Java DataBase Connectivity, and it is an API for connecting a Java Application to a Database

    //A schema in MySQL is equivalent to a database


package com.javafxproject.javafx_login_and_signup_form;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

    // Blue Hex - 0066F5
    // White Hex - FFFFFF
    // Anchor pane is a layout that allows us to place components at specific distances from its sides. It is
    // essentially a drag and drop