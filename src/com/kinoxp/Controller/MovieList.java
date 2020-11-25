package com.kinoxp.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class MovieList extends Application {

    MainMenu mainMenu = new MainMenu();

    // Method to go back to the previous page
    public void backButton(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/MainMenu.fxml");

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/MovieList.fxml"));
        primaryStage.setTitle("Film Liste");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    // Method to open MovieInformation.fxml - Button: "Se Information"
    @FXML
    public void movieInformation(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/MovieInformation.fxml");
    }


    public static void main(String[] args) {
        launch(args);
    }
}

