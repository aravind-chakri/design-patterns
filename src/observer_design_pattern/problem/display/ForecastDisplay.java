package observer_design_pattern.problem.display;

public class ForecastDisplay {

    public void update(float temp, float humidity, float pressure) {
        System.out.println("ForecastDisplay [temp: " + temp +
                " humidity: " + humidity + " pressure: " + pressure + "]");
    }
}
