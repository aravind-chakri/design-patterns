package observer_desgin_pattern.problem.display;

public class CurrentConditionDisplay {

    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionDisplay [temp: " + temp +
                " humidity: " + humidity + " pressure: " + pressure + "]");
    }
}
