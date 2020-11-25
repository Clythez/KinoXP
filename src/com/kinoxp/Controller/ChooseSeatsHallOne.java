package com.kinoxp.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseSeatsHallOne extends Application {

    MainMenu mainMenu = new MainMenu();

    // Method to open the ChooseSeatsHallOne.fxml file
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/ChooseSeatsHallOne.fxml"));
        primaryStage.setTitle("Plads Bestilling Sal 1");
        primaryStage.setScene(new Scene(root, 800,600));
        primaryStage.show();
    }

    // Method to open the OrderSummary.fxml file - button: "Bekræft"
    public void orderConfirmation(ActionEvent event) throws IOException{

        mainMenu.pressButton(event, "../View/OrderSummary.fxml");

    }

    public void backButton(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/OrderMovie.fxml");

    }




    public static void main(String[] args){launch(args);

    }

}
