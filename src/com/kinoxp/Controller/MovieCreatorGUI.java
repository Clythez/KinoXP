package com.kinoxp.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieCreatorGUI extends Application {

    MainMenu mainMenu = new MainMenu();

    // Method to go back to the previous page
    public void backButton(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/MainMenu.fxml");

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/MovieCreatorGUI.fxml"));
        primaryStage.setTitle("Opret film");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
