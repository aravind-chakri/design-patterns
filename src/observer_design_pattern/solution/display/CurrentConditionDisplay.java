package observer_design_pattern.solution.display;

import observer_design_pattern.solution.DisplayElement;
import observer_design_pattern.solution.Observer;
import observer_design_pattern.solution.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions Display: " + temp +
                " degrees temperature " + humidity + " humidity");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
