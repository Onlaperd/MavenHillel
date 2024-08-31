package Homework_4;

import java.util.Scanner;

public class BasketballTeams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть ім'я першої команди: ");
        String firstTeamName = scan.nextLine();

        System.out.println("Введіть ім'я другої команди: ");
        String secondTeamName = scan.nextLine();

        int averageGoalsAmountFirstTeam = countAverageGoals(3, 4,
                7, 1, 5);

        int averageGoalsAmountSecondTeam = countAverageGoals(9, 1,
                7, 10, 2);

        if (averageGoalsAmountFirstTeam > averageGoalsAmountSecondTeam){
            System.out.println("Перемогла команда " + firstTeamName + " набрала " + averageGoalsAmountFirstTeam + " очків");
        } else if (averageGoalsAmountFirstTeam < averageGoalsAmountSecondTeam) {
            System.out.println("Перемогла команда " + secondTeamName + " набрала " + averageGoalsAmountSecondTeam + " очків");
        } else{
            System.out.println("нічія");
        }
    }

    public static int countAverageGoals(int firstPlayerGoalsAmount, int secondPlayerGoalsAmount, int thirdPlayerGoalsAmount,
                                 int fourthPlayerGoalsAmount, int fifthPlayerGoalsAmount){
        return (firstPlayerGoalsAmount + secondPlayerGoalsAmount + thirdPlayerGoalsAmount + fourthPlayerGoalsAmount +
                fifthPlayerGoalsAmount) / 5;
    }
}