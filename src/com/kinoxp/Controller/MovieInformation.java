package com.kinoxp.Controller;

import com.kinoxp.Model.DatabaseConnector;
import com.kinoxp.Model.DatabaseStatements;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

//
public class MovieInformation implements Initializable {

    @FXML private Label titleLabel, lengthLabel, genreLabel, ageLabel;
    @FXML private Button backButton, statButton, editButton;



    @FXML private void handleBackButton(ActionEvent event){
        System.out.println("Back button pressed!");
    }

    @FXML private void handleStatButton(ActionEvent event){
        System.out.println("Stat button pressed!");
    }

    @FXML private void handleEditButton(ActionEvent event){
        System.out.println("Edit button pressed!");
    }

    //Initialize runs when the page is loaded. Is used to preload labels.
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        DatabaseStatements.useDB();
        DatabaseConnector.connect();

        //Hardcodet "Valgt" film
        DatabaseStatements.insertIntoMovies("movies", "2012"  , "catastrophe", 90, 3);
        String[] rs = DatabaseStatements.queryMovieInformation(1);

        titleLabel.setText(rs[1]);
        lengthLabel.setText(rs[2]);
        genreLabel.setText(rs[3]);
        ageLabel.setText(rs[4]);

    }

    MainMenu mainMenu = new MainMenu();

    // Method to go back to the previous page
    public void backButton(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/MovieList.fxml");

    }

}