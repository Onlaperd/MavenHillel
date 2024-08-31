package Homework_6;

import java.util.Arrays;

public class rugbyTeams {

    static int[] team1 = new int[5];
    static int[] team2 = new int[]{18, 39, 25, 28, 35};

    public static void main(String[] args) {
        team1[0] = 32;
        team1[1] = 19;
        team1[2] = 21;
        team1[3] = 28;
        team1[4] = 31;

        System.out.println("вік гравців першої команди: " + Arrays.toString(team1));
        System.out.println("вік гравців другої команди: " + Arrays.toString(team2));

        System.out.println("середній вік гравців першої команди: " + countAverage(team1));
        System.out.println("середній вік гравців другої команди: " + countAverage(team2));

    }

    public static double countAverage(int[] team){
        return (double) (team[0] + team[1] + team[2] + team[3] + team[4]) / 5;
    }

}
