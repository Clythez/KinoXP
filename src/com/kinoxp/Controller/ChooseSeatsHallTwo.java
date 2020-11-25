package com.kinoxp.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChooseSeatsHallTwo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/ChooseSeatsHallTwo.fxml"));
        primaryStage.setTitle("Plads Bestilling Sal 2");
        primaryStage.setScene(new Scene(root, 800,600));
        primaryStage.show();
    }

    public static void main(String[] args){launch(args);

    }



}
