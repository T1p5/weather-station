package weatherstation;

import weatherstation.display.CurrentConditionsDisplay;
import weatherstation.display.ForecastDisplay;
import weatherstation.display.HeatIndexDisplay;
import weatherstation.display.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(27, 65, 30.4f);
        System.out.println("-------------------------------------------------");
        weatherData.setMeasurements(28, 70, 29.2f);
        System.out.println("-------------------------------------------------");
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(26, 90, 29.2f);
    }
}
