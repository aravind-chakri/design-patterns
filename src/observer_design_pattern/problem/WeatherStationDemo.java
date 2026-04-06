package observer_design_pattern.problem;

public class WeatherStationDemo {
    public static void main(String[] args) {

        System.out.println("<<<<Initial Display Information>>>>");
        WeatherData weatherData = new WeatherData(26, 49, 100);
        System.out.println("<<<<Display Information After Changes>>>>");
        weatherData.setMeasurements(27, 46, 110);

    }
}
