package com.kinoxp.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class MainMenu extends Application {

    // fields
    @FXML
    private Button reservation;

    // Method to press a button with an actionEventListener
    public void pressButton(ActionEvent event, String path) throws IOException {

        Parent test = FXMLLoader.load(getClass().getResource(path));

        Scene orderMovieScene = new Scene(test);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();

        window.setScene(orderMovieScene);

        window.show();
    }

    // Method to open the main menu
    @Override
    public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
            primaryStage.setTitle("KinoXP");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
    }

    // Method to open the OrderMovie.fxml to start the reservation - Button: "Bestilling"
    @FXML
    public void reservation(ActionEvent event) throws IOException {

        pressButton(event, "../View/OrderMovie.fxml");

    }

    // Method to open the MovieCreatorGUI.fxml to create a movie - Button: "Opret Film"
    @FXML
    public void createMovie(ActionEvent event) throws IOException{

        pressButton(event, "../View/MovieCreatorGUI.fxml");

    }

    // Method to open the movieList.fxml file - Button: "Film oversigt"
    @FXML
    public void movieList(ActionEvent event) throws IOException {

        pressButton(event, "../View/MovieList.fxml");

    }

    // main method to start the application
    public static void main(String[] args){
        launch(args);
    }


}
