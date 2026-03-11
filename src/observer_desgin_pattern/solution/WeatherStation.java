package observer_desgin_pattern.solution;

import observer_desgin_pattern.solution.display.CurrentConditionDisplay;
import observer_desgin_pattern.solution.display.ForeCastDisplay;
import observer_desgin_pattern.solution.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurements(27, 65, 30);

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);

        weatherData.setMeasurements(29, 60, 33);

    }
}
