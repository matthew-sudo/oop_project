package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mainPageController {

    @FXML
    private Button openCatalogBtn;

    @FXML
    private Button openCatalogBtn1;

    @FXML
    private void openCatalogBtnClick() {
        try {
            // Load the new FXML file
            Pane newPane = FXMLLoader.load(getClass().getResource("catalog.fxml"));
            // Create a new scene with the loaded pane
            Scene newScene = new Scene(newPane);
            // Get the current stage
            Stage currentStage = (Stage) openCatalogBtn1.getScene().getWindow();
            // Set the new scene to the current stage
            currentStage.setScene(newScene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
