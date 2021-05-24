package headfirst.designpatterns.observer.weatherobservable;

import headfirst.designpatterns.observer.weather.DisplayElement;

import java.util.Observer;

import java.util.Observable;


public class ForecastDisplay implements Observer, DisplayElement {
    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void display() {

    }
}
