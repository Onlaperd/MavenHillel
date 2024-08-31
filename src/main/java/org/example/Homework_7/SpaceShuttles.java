package Homework_7;

import java.util.Arrays;

public class SpaceShuttles {

    static int[] spaceShuttlesNumbers = new int[100];

    public static void main(String[] args) {
        printSpaceShuttlesNumbers();
    }

    public static void printSpaceShuttlesNumbers(){
        int counter = 0;
        int number = 1;
        for (int i = 0; i < 100; i++) {

            if (!((number - 4) % 10 == 0) && !((number - 9) % 10 == 0) && !(number - 40 < 10 && number - 40 > -1)
                    && !(number - 90 < 10 && number - 90 > -1) && !(number - 140 < 10 && number - 140 > -1)){
                spaceShuttlesNumbers[counter] = number;
                counter++;
            }
            else{
                i--;
            }
            number++;
        }

        System.out.println(Arrays.toString(spaceShuttlesNumbers));

    }

}
