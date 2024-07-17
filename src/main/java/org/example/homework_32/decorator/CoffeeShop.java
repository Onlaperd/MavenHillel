package org.example.homework_32.decorator;

public class CoffeeShop {

    public static void main(String[] args) {

        Coffee coffeeStandard = new SimpleCoffee();
        Coffee coffeeChocolate = new ChocolateDecorator(new SimpleCoffee());
        Coffee coffeeVanilla = new VanillaDecorator(new SimpleCoffee());
        Coffee coffeeMilk = new MilkDecorator(new SimpleCoffee());
        Coffee coffeeTurboMix =  new ChocolateDecorator(new VanillaDecorator(new MilkDecorator(new SimpleCoffee())));

        System.out.println(coffeeStandard.getDescription() + " буде коштувати " + coffeeStandard.cost() + "грн");
        System.out.println(coffeeChocolate.getDescription() + " буде коштувати " + coffeeChocolate.cost() + "грн");
        System.out.println(coffeeVanilla.getDescription() + " буде коштувати " + coffeeVanilla.cost() + "грн");
        System.out.println(coffeeMilk.getDescription() + " буде коштувати " + coffeeMilk.cost() + "грн");
        System.out.println(coffeeTurboMix.getDescription() + " буде коштувати " + coffeeTurboMix.cost() + "грн");


    }

}
