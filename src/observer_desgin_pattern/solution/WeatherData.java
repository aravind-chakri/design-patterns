package observer_desgin_pattern.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer obj : observers) {
            obj.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanges() {
        notifyObserver();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
    }
}
