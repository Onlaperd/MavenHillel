package Homework_5;

import java.util.Scanner;

public class RestaurantMenu {
    static String pasta = "Pasta";
    static String pizza = "Pizza";
    static String salad = "Salad";
    static String soup = "Soup";
    static int pastaPrice = 100;
    static int pizzaPrice = 350;
    static int saladPrice = 75;
    static int soupPrice = 155;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        makeOrder();

        System.out.println("Бажаєте замовити ще щось?(так/ні): ");
        String continueOrNot = scan.nextLine();

        // Я пробував написати умову continueOrNot == "так" але воно чомусь не праціювало
        // IntelliJ IDEA запропонувала такий запис: continueOrNot.equals("так") який я і використав
        
        if (continueOrNot.equals("так")){
            makeOrder();
        } else if (continueOrNot.equals("ні")) {
            System.out.println("Добре, дякуємо за замовлення!");
        } else{
            System.out.println("потрібно ввести так/ні");
        }

    }

    public static void makeOrder(){
        Scanner scan = new Scanner(System.in);
        System.out.println("виберіть страву(Pasta/Pizza/Salad/Soup): ");
        String order = scan.nextLine();

        String result;

        switch(order){
            case "Pasta":
                result = "Ви вибрали " + pasta + ", ціна: " + pastaPrice;
                break;
            case "Pizza":
                result = "Ви вибрали " + pizza + ", ціна: " + pizzaPrice;
                break;
            case "Salad":
                result = "Ви вибрали " + salad + ", ціна: " + saladPrice;
                break;
            case "Soup":
                result = "Ви вибрали " + soup + ", ціна: " + soupPrice;
                break;
            default:
                result = "Цієї страви немає у меню";
        }

        System.out.println(result);
    }

}