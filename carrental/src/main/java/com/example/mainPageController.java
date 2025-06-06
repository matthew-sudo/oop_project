// File: src/main/java/com/example/MainPageController.java
package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class mainPageController {

    @FXML
    private void openCatalogBtnClick(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Catalog");
        alert.setHeaderText(null);
        alert.setContentText("Catalog opened or Contact Us clicked.");
        alert.showAndWait();
    }
}
