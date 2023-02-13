package com.example.weatherapitester;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.locks.Condition;

public class WeatherApiTester {

    private static final Logger logger = LoggerFactory.getLogger(WeatherApiTester.class);

    public static void main(String[] args) {
        String apiKey = "cd9bc59ded6046859f8105127231202";
        String location = "Kolkata";
        String endpoint = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + location + "&aqi=no";

        try {
            URL url = new URL(endpoint);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            int responseCode = con.getResponseCode();
            logger.info("Response Code: {}", responseCode);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Condition.class, new ConditionInstanceCreator())
                    .create();
            WeatherData weatherData = gson.fromJson(response.toString(), WeatherData.class);
            logger.info("Weather Data: {}", weatherData);
        } catch (Exception e) {
            logger.error("Error while getting weather data: {}", e.getMessage());
        }
    }
}


