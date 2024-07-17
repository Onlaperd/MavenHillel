package org.example.homework_32.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "звичйна кава";
    }

    @Override
    public double cost() {
        return 40;
    }
}
