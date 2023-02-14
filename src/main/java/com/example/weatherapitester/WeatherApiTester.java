package com.example.weatherapitester;

import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.concurrent.locks.Condition;

public class WeatherApiTester {

    private static final Logger logger = LoggerFactory.getLogger(WeatherApiTester.class);

    private interface WeatherApiService {
        @GET("current.json")
        Call<WeatherData> getCurrentWeatherData(@Query("key") String apiKey, @Query("q") String location, @Query("aqi") String aqi);
    }

    public static void main(String[] args) {
        String apiKey = "cd9bc59ded6046859f8105127231202";
        String location = "Kolkata";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.weatherapi.com/v1/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder()
                        .registerTypeAdapter(Condition.class, new ConditionInstanceCreator())
                        .create()))
                .build();

        WeatherApiService service = retrofit.create(WeatherApiService.class);
        Call<WeatherData> call = service.getCurrentWeatherData(apiKey, location, "no");

        try {
            WeatherData weatherData = call.execute().body();
            logger.info("Weather Data: {}", weatherData);
        } catch (IOException e) {
            logger.error("Error while getting weather data: {}", e.getMessage());
        }
    }
}
