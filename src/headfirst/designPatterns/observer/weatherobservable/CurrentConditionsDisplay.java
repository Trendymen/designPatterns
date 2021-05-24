package headfirst.designPatterns.observer.weatherobservable;

import headfirst.designPatterns.observer.weather.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    CurrentConditionsDisplay(Observable obs) {
        observable = obs;
        obs.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData weatherData) {
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }
}
