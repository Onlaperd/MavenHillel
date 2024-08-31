package Homework_15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean exit = false;

        while (!exit){
            Scanner scanner = new Scanner(System.in);
            UserAction[] userActions = new UserAction[]{
                    new CircleSquare(scanner),
                    new RectangleSquare(scanner),
                    new TriangleSquare(scanner)
            };

            System.out.println("0 вихід");

            for (int i = 0; i < userActions.length; i++) {
                System.out.println(i+1 + " " + userActions[i].getName());
            }

            System.out.println("Виберіть пункт меню");
            int choice = scanner.nextInt() - 1;

            if (choice >=0 && choice < userActions.length){
                userActions[choice].doAction();
            }else if (choice == -1){
                exit = true;
            }
            else {
                System.out.println("Ви вибрали невірний пункт меню");
            }
        }







    }
}
