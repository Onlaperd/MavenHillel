package Homework_8;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burgerNormal = new Burger("Булочка", "мясо","сир", "салат", "майонез");
        Burger burgerDietary = new Burger("Булочка", "мясо","сир", "салат");
        Burger burgerDoubleMeat = new Burger("Булочка", "мясо", "мясо (+1)","сир", "салат", "майонез");
    }
}
