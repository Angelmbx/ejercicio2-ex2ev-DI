package com.example.ejercicio2examen2evdi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VentaBilletesController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}