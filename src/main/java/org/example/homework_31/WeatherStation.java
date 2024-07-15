package org.example.homework_31;

import java.util.ArrayList;

public class WeatherStation {

    private ArrayList<Observer> observers;
    private int temperature;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    public void updateTemperature(int temperature){
        this.temperature = temperature;
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(temperature);
        }
    }

}
