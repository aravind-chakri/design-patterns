package observer_desgin_pattern.solution.display;

import observer_desgin_pattern.solution.DisplayElement;
import observer_desgin_pattern.solution.Observer;
import observer_desgin_pattern.solution.WeatherData;

public class ForeCastDisplay implements Observer, DisplayElement {
    private float temp;
    private float pressure;
    private WeatherData weatherData;

    public ForeCastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForeCast Display: " + temp +
                " degrees temperature " + pressure + " pressure");
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
