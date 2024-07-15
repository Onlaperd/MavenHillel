package org.example.homework_31;

public class DisplayTv implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("TV Displayed new temperature: " + temperature);
    }
}
