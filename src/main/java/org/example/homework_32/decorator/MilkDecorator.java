package org.example.homework_32.decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " з молоком";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 10;
    }
}
