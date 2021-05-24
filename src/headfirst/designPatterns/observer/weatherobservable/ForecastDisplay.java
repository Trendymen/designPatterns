package headfirst.designpatterns.observer.weatherobservable;

import headfirst.designpatterns.observer.weather.DisplayElement;

import java.util.Observer;

import java.util.Observable;


public class ForecastDisplay implements Observer, DisplayElement {
    private float lastPressure;
    private float currentPressure = 29.2f;
    private Observable observable;

    public ForecastDisplay(Observable obs) {
        this.observable = obs;
        obs.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData weatherData) {
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(lastPressure + " " + currentPressure);
    }
}
