package observer_desgin_pattern.problem;

import observer_desgin_pattern.problem.display.CurrentConditionDisplay;
import observer_desgin_pattern.problem.display.ForeCastDisplay;
import observer_desgin_pattern.problem.display.StatisticsDisplay;

public class WeatherData {
    float temp;
    float humidity;
    float pressure;
    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForeCastDisplay foreCastDisplay = new ForeCastDisplay();

    public WeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        foreCastDisplay.update(temp,humidity,pressure);
        statisticsDisplay.update(temp,humidity,pressure);

    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
