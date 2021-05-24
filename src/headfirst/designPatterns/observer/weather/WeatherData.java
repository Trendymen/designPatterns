package headfirst.designPatterns.observer.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {
    final private ArrayList<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
