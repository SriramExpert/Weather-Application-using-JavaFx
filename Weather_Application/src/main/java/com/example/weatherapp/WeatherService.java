package com.example.weatherapp;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

public class WeatherService {
    private static final String API_KEY = "Your_API_key"; // Replace with your OpenWeatherMap key
    private static final String BASE_URL =
            "https://api.openweathermap.org/data/2.5/weather?units=metric&q=";

    public static WeatherData getWeather(String city) throws Exception {
        String url = BASE_URL + city + "&appid=" + API_KEY;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            JSONObject obj = new JSONObject(response.body());
            String name = obj.getString("name");
            JSONObject main = obj.getJSONObject("main");
            double temp = main.getDouble("temp");
            int humidity = main.getInt("humidity");
            String description = obj.getJSONArray("weather")
                    .getJSONObject(0)
                    .getString("description");

            return new WeatherData(name, temp, humidity, description);
        } else {
            return null;
        }
    }
}
