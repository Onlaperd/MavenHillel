package org.example.homework_31;

public class Main {

    public static void main(String[] args) {

        DisplayPhone phone = new DisplayPhone();
        DisplayPhone phone2 = new DisplayPhone();
        DisplayTv tv = new DisplayTv();

        WeatherStation weatherStation = new WeatherStation();

        weatherStation.add(phone);
        weatherStation.add(phone2);
        weatherStation.add(tv);

        weatherStation.remove(phone2);

        weatherStation.updateTemperature(23);
        weatherStation.notifyObservers();

    }

}