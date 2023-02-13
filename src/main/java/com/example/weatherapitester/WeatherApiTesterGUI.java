package com.example.weatherapitester;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.locks.Condition;

public class WeatherApiTesterGUI extends JFrame implements ActionListener {
    private JTextField locationField;
    private JButton fetchButton;
    private JLabel weatherLabel;

    public WeatherApiTesterGUI() {
        setTitle("Weather API Tester");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        locationField = new JTextField(20);
        fetchButton = new JButton("Fetch Weather");
        weatherLabel = new JLabel("");

        fetchButton.addActionListener(this);

        add(locationField);
        add(fetchButton);
        add(weatherLabel);

        pack();
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fetchButton) {
            String apiKey = "cd9bc59ded6046859f8105127231202";
            String location = locationField.getText();
            String endpoint = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + location + "&aqi=no";

            try {
                URL url = new URL(endpoint);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setRequestProperty("Content-Type", "application/json");

                int responseCode = con.getResponseCode();

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

                weatherLabel.setText(weatherData.toString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error while getting weather data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new WeatherApiTesterGUI();
    }
}
