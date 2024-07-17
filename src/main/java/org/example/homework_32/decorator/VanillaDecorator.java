package org.example.homework_32.decorator;

public class VanillaDecorator extends CoffeeDecorator{

    public VanillaDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " з ваніллю";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 10;
    }
}
