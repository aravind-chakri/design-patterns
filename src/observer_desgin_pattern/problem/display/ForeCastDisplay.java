package observer_desgin_pattern.problem.display;

public class ForeCastDisplay {

    public void update(float temp, float humidity, float pressure) {
        System.out.println("ForecastDisplay [temp: " + temp +
                " humidity: " + humidity + " pressure: " + pressure + "]");
    }
}
