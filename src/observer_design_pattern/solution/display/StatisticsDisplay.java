package observer_design_pattern.solution.display;

import observer_design_pattern.solution.DisplayElement;
import observer_design_pattern.solution.Observer;
import observer_design_pattern.solution.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Statistic Display: " + temp +
                " degrees temperature " + humidity + " humidity " + pressure + " pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
