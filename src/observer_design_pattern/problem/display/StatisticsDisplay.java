package observer_design_pattern.problem.display;

public class StatisticsDisplay {

    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay [temp: " + temp +
                " humidity: " + humidity + " pressure: " + pressure + "]");
    }
}
