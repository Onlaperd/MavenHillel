package org.example.homework_31;

public class DisplayPhone implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Phone Displayed new temperature: " + temperature);
    }
}
