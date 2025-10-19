package com.example.weatherapp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class WeatherApp extends Application {

    private Label cityLabel = new Label("City:");
    private TextField cityField = new TextField();
    private Button fetchButton = new Button("Get Weather");
    private TextArea resultArea = new TextArea();

    @Override
    public void start(Stage stage) {
        stage.setTitle("🌦️ Weather App - REST API Client");

        // Input layout
        HBox inputBox = new HBox(10, cityLabel, cityField, fetchButton);
        inputBox.setAlignment(Pos.CENTER);
        inputBox.setPadding(new Insets(20));

        // Result area
        resultArea.setEditable(false);
        resultArea.setPrefHeight(250);
        resultArea.setFont(Font.font("Consolas", 14));

        // Main layout
        VBox root = new VBox(10, inputBox, resultArea);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #eef5ff;");

        // Button action
        fetchButton.setOnAction(e -> {
            String city = cityField.getText().trim();
            if (!city.isEmpty()) {
                try {
                    WeatherData data = WeatherService.getWeather(city);
                    if (data != null) {
                        resultArea.setText(data.toString());
                    } else {
                        resultArea.setText("❌ No data found for: " + city);
                    }
                } catch (Exception ex) {
                    resultArea.setText("⚠️ Error fetching weather data.\n" + ex.getMessage());
                }
            } else {
                resultArea.setText("Please enter a city name.");
            }
        });

        Scene scene = new Scene(root, 500, 400);
        stage.setScene(scene);
        stage.show();
    }
}
