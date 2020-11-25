package com.kinoxp.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderSummary extends Application {

    MainMenu mainMenu = new MainMenu();

    // Method to open the OrderSummary.fxml file
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/OrderSummary.fxml"));
        primaryStage.setTitle("Bekræftelse af ordre");
        primaryStage.setScene(new Scene(root, 800,600));
        primaryStage.show();
    }

    // Method to return to the main menu
    public void returnToMainMenu(ActionEvent event) throws IOException {

        mainMenu.pressButton(event, "../View/MainMenu.fxml");

    }

    public static void main(String[] args){launch(args);

    }



}
