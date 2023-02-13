package com.example.weatherapitester;

import com.google.gson.annotations.SerializedName;

import java.util.concurrent.locks.Condition;


public class WeatherData {
    @SerializedName("location")
    private Location location;

    @SerializedName("current")
    private Current current;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "WeatherData{\n" +
                "location=" + location + "\n" +
                " current=" + current + "\n"+
                '}';
    }

    public static class Location {
        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        private String tz_id;
        private int localtime_epoch;
        private String localtime;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public String getTz_id() {
            return tz_id;
        }

        public void setTz_id(String tz_id) {
            this.tz_id = tz_id;
        }

        public int getLocaltime_epoch() {
            return localtime_epoch;
        }

        public void setLocaltime_epoch(int localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
        }

        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

        @Override
        public String toString() {
            return "Location{\n" +
                    "name='" + name + '\'' + "\n" +
                    " region='" + region + '\'' + "\n" +
                    " country='" + country + '\'' + "\n" +
                    " lat=" + lat + "\n" +
                    " lon=" + lon + "\n" +
                    " tz_id='" + tz_id + '\'' + "\n"  +
                    " localtime_epoch=" + localtime_epoch + "\n" +
                    " localtime='" + localtime + '\'' + "\n" +
                    '}';
        }
    }

    public static class Current {
        @SerializedName("last_updated_epoch")
        private int lastUpdatedEpoch;
        @SerializedName("last_updated")
        private String lastUpdated;
        @SerializedName("temp_c")
        private double temperatureInCelsius;
        @SerializedName("temp_f")
        private double temperatureInFahrenheit;
        @SerializedName("is_day")
        private int isDay;
        @SerializedName("condition")
        private Condition condition;
        @SerializedName("wind_mph")
        private double windSpeedInMph;
        @SerializedName("wind_kph")
        private double windSpeedInKph;
        @SerializedName("wind_degree")
        private int windDegree;
        @SerializedName("wind_dir")
        private String windDirection;
        @SerializedName("pressure_mb")
        private double pressureInMillibar;
        @SerializedName("pressure_in")
        private double pressureInInch;
        @SerializedName("precip_mm")
        private double precipitationInMillimeter;
        @SerializedName("precip_in")
        private double precipitationInInch;
        @SerializedName("humidity")
        private int humidity;
        @SerializedName("cloud")
        private int cloudCover;
        @SerializedName("feelslike_c")
        private double feelsLikeTemperatureInCelsius;
        @SerializedName("feelslike_f")
        private double feelsLikeTemperatureInFahrenheit;
        @SerializedName("vis_km")
        private double visibilityInKilometer;
        @SerializedName("vis_miles")
        private double visibilityInMiles;
        @SerializedName("uv")
        private double uvIndex;
        @SerializedName("gust_mph")
        private double gustSpeedInMph;
        @SerializedName("gust_kph")
        private double gustSpeedInKph;

        public int getLastUpdatedEpoch() {
            return lastUpdatedEpoch;
        }

        public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
            this.lastUpdatedEpoch = lastUpdatedEpoch;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public double getTemperatureInCelsius() {
            return temperatureInCelsius;
        }

        public void setTemperatureInCelsius(double temperatureInCelsius) {
            this.temperatureInCelsius = temperatureInCelsius;
        }

        public double getTemperatureInFahrenheit() {
            return temperatureInFahrenheit;
        }

        public void setTemperatureInFahrenheit(double temperatureInFahrenheit) {
            this.temperatureInFahrenheit = temperatureInFahrenheit;
        }

        public int getIsDay() {
            return isDay;
        }

        public void setIsDay(int isDay) {
            this.isDay = isDay;
        }

        public Condition getCondition() {
            return condition;
        }

        public void setCondition(Condition condition) {
            this.condition = condition;
        }

        public double getWindSpeedInMph() {
            return windSpeedInMph;
        }

        public void setWindSpeedInMph(double windSpeedInMph) {
            this.windSpeedInMph = windSpeedInMph;
        }

        public double getWindSpeedInKph() {
            return windSpeedInKph;
        }

        public void setWindSpeedInKph(double windSpeedInKph) {
            this.windSpeedInKph = windSpeedInKph;
        }

        public int getWindDegree() {
            return windDegree;
        }

        public void setWindDegree(int windDegree) {
            this.windDegree = windDegree;
        }

        public String getWindDirection() {
            return windDirection;
        }

        public void setWindDirection(String windDirection) {
            this.windDirection = windDirection;
        }

        public double getPressureInMillibar() {
            return pressureInMillibar;
        }

        public void setPressureInMillibar(double pressureInMillibar) {
            this.pressureInMillibar = pressureInMillibar;
        }

        public double getPressureInInch() {
            return pressureInInch;
        }

        public void setPressureInInch(double pressureInInch) {
            this.pressureInInch = pressureInInch;
        }

        public double getPrecipitationInMillimeter() {
            return precipitationInMillimeter;
        }

        public void setPrecipitationInMillimeter(double precipitationInMillimeter) {
            this.precipitationInMillimeter = precipitationInMillimeter;
        }

        public double getPrecipitationInInch() {
            return precipitationInInch;
        }

        public void setPrecipitationInInch(double precipitationInInch) {
            this.precipitationInInch = precipitationInInch;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getCloudCover() {
            return cloudCover;
        }

        public void setCloudCover(int cloudCover) {
            this.cloudCover = cloudCover;
        }

        public double getFeelsLikeTemperatureInCelsius() {
            return feelsLikeTemperatureInCelsius;
        }

        public void setFeelsLikeTemperatureInCelsius(double feelsLikeTemperatureInCelsius) {
            this.feelsLikeTemperatureInCelsius = feelsLikeTemperatureInCelsius;
        }

        public double getFeelsLikeTemperatureInFahrenheit() {
            return feelsLikeTemperatureInFahrenheit;
        }

        public void setFeelsLikeTemperatureInFahrenheit(double feelsLikeTemperatureInFahrenheit) {
            this.feelsLikeTemperatureInFahrenheit = feelsLikeTemperatureInFahrenheit;
        }

        public double getVisibilityInKilometer() {
            return visibilityInKilometer;
        }

        public void setVisibilityInKilometer(double visibilityInKilometer) {
            this.visibilityInKilometer = visibilityInKilometer;
        }

        public double getVisibilityInMiles() {
            return visibilityInMiles;
        }

        public void setVisibilityInMiles(double visibilityInMiles) {
            this.visibilityInMiles = visibilityInMiles;
        }

        public double getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(double uvIndex) {
            this.uvIndex = uvIndex;
        }

        public double getGustSpeedInMph() {
            return gustSpeedInMph;
        }

        public void setGustSpeedInMph(double gustSpeedInMph) {
            this.gustSpeedInMph = gustSpeedInMph;
        }

        public double getGustSpeedInKph() {
            return gustSpeedInKph;
        }

        public void setGustSpeedInKph(double gustSpeedInKph) {
            this.gustSpeedInKph = gustSpeedInKph;
        }




        @Override
        public String toString() {
            return "Current{+ \n" +
                    "last_updated_epoch=" + lastUpdatedEpoch + "\n" +
                    " last_updated='" + lastUpdated + '\'' + "'\n" +
                    " temp_c=" + temperatureInCelsius + "\n" +
                    " temp_f=" + temperatureInFahrenheit + "\n" +
                    " is_day=" + isDay + "\n" +
                    " condition=" + condition + "\n" +
                    " wind_mph=" + windSpeedInMph + "\n" +
                    " wind_kph=" + windSpeedInKph + "\n" +
                    " wind_degree=" + windDegree + "\n" +
                    " wind_dir='" + windDirection + '\'' + "'\n" +
                    " pressure_mb=" + pressureInMillibar + "\n" +
                    " pressure_in=" + pressureInInch + "\n" +
                    " precip_mm=" + precipitationInMillimeter + "\n" +
                    " precip_in=" + precipitationInInch + "\n" +
                    " humidity=" + humidity + "\n" +
                    " cloud=" + cloudCover + "\n" +
                    " feelslike_c=" + feelsLikeTemperatureInCelsius + "\n" +
                    " feelslike_f=" + feelsLikeTemperatureInFahrenheit + "\n" +
                    " vis_km=" + visibilityInKilometer + "\n" +
                    " vis_miles=" + visibilityInMiles + "\n" +
                    " uv=" + uvIndex + "\n" +
                    " gust_mph=" + gustSpeedInMph + "\n" +
                    " gust_kph=" + gustSpeedInKph + "\n" +
                    '}';
        }
    }
}

