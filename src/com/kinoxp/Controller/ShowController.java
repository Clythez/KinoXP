package com.kinoxp.Controller;

import com.kinoxp.Model.DatabaseConnector;
import com.kinoxp.Model.DatabaseStatements;
import com.kinoxp.Model.Show;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ShowController implements Initializable {

    @FXML private TextField movieId, timeId, hallId, priceId, feeId;
    @FXML private Button backButton, createShowButton;

    @FXML private void handleBackButton(ActionEvent event) {
        System.out.println("Back button pressed!");
    }

    @FXML private void handleCreateShowButton(ActionEvent event) {
        System.out.println("Create Show Button pressed!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Show show = new Show();
        // Fill up the object with information from the GUI
        show.setMovieID(Integer.parseInt(movieId.getText()));
        show.setFromTime(timeId.getText());
        show.setHallID(Integer.parseInt(hallId.getText()));
        show.setPrice(Double.parseDouble(priceId.getText()));
        show.setFee(Integer.parseInt(feeId.getText()));

        DatabaseStatements.useDB();
        DatabaseConnector.connect();

        Show show2 = new Show(1, 1, 50, 1, "9/10-12");
        DatabaseStatements.insertIntoShows(show2);

    }
}
