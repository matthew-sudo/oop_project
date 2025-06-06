package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class CatalogController {

    @FXML
    private void selectCar1() {
        showAlert("You have selected Car 1: Sedan for $50/day.");
    }

    @FXML
    private void selectCar2() {
        showAlert("You have selected Car 2: SUV for $70/day.");
    }

    @FXML
    private void selectCar3() {
        showAlert("You have selected Car 3: Convertible for $90/day.");
    }

    @FXML
    private void selectCar4() {
        showAlert("You have selected Car 4: Truck for $80/day.");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Car Selection");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
