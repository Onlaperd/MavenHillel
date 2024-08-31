package Homework_7;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {
        int guessedNumber;
        int guess;

        Random random = new Random();
        guessedNumber = random.nextInt(11);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Вгадайте число від 0 до 10, у вас 3 спроби");
        for (int i = 3; i > 0 ; i--) {
            guess = scanner.nextInt();

            if (guess == guessedNumber){
                System.out.println("Ви вгадали число, ви виграли!");
                break;
            }
            else {
                System.out.println("Неправильно! У вас залишилося " + (i - 1) + " спроби");
            }
        }

    }
}