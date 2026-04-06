package observer_design_pattern.solution.display;

import observer_design_pattern.solution.DisplayElement;
import observer_design_pattern.solution.Observer;
import observer_design_pattern.solution.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temp;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Display: " + temp +
                " degrees temperature " + pressure + " pressure");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
