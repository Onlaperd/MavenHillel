package org.example.homework_32.decorator;

public class ChocolateDecorator extends CoffeeDecorator{

    public ChocolateDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " з шоколадом";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 10;
    }
}
