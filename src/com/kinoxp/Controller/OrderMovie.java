package com.kinoxp.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderMovie {

    MainMenu mainMenu = new MainMenu();

    // Method to open the ChooseSeatsHallOne.fxml to book a seat in hall one - Button: "Næste"
    @FXML
    public void hallOne(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/ChooseSeatsHallOne.fxml");

    }

    @FXML
    public void backButton(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/MainMenu.fxml");

    }




}
