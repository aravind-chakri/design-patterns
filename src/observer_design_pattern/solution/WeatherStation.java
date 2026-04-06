package observer_design_pattern.solution;

import observer_design_pattern.solution.display.CurrentConditionDisplay;
import observer_design_pattern.solution.display.ForecastDisplay;
import observer_design_pattern.solution.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.setMeasurements(27, 65, 30);

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(29, 60, 33);

    }
}
