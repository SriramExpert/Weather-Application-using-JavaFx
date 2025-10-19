package com.example.weatherapp;

public class WeatherData {
    private String city;
    private double temperature;
    private int humidity;
    private String description;

    public WeatherData(String city, double temperature, int humidity, String description) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
            "🌆 City: %s\n🌡️ Temperature: %.1f °C\n💧 Humidity: %d%%\n☁️ Description: %s",
            city, temperature, humidity, description
        );
    }
}
