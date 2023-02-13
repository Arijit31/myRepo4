package com.example.weatherapitester;

import javax.swing.*;

public class WeatherApp extends JFrame {
    private final WeatherApiTester weatherApiTester;

    public WeatherApp() {
        weatherApiTester = new WeatherApiTester();

        setTitle("Weather App");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WeatherApp();
    }
}
