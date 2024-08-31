package Homework_18;

import java.util.Arrays;

public class StringTasks {

    static String helloString = "hello";
    static String helloWorld = "hello world";

    public static void main(String[] args) {
        System.out.println("перша задача:");
        System.out.println(helloString);
        System.out.println(stringReverse(helloString));
        System.out.println("------");

        System.out.println("Друга задача:");
        System.out.println("У змінній helloString " + vowelsCount(helloString) + " голосних");
        System.out.println("------");

        System.out.println("третя задача:");
        System.out.println("Твердження що слово привіт є палідромом це " + palindromCheck("привіт"));
        System.out.println("Твердження що слово око є палідромом це " + palindromCheck("око"));
        System.out.println("------");

        System.out.println("четверта задача:");
        System.out.println(helloString);
        System.out.println(duplicateDelete(helloString));
        System.out.println("------");

        System.out.println("п'ята задача:");
        System.out.println(Arrays.toString(helloWorld.split(" ")));
        System.out.println("------");


    }

    public static String stringReverse(String string) {
        StringBuilder stringReverse = new StringBuilder(string);
        stringReverse.reverse();
        return stringReverse.toString();
    }

    public static int vowelsCount(String string) {

        String[] symbolsArray = string.split("");

        int result = 0;

        for (String element : symbolsArray) {
            switch (element) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    result++;
                    break;
            }

        }
        return result;
    }

    public static boolean palindromCheck(String string) {
        return string.equals(stringReverse(string));
    }

    public static String duplicateDelete(String string) {
        char[] charArrayed = string.toCharArray();

        for (int i = 0; i < charArrayed.length; i++) {

            if (!(i == 0)) {
                    if (charArrayed[i] == charArrayed[i - 1]){
                        charArrayed[i] = '\0';
                    }

            }
        }

        StringBuilder buildString = new StringBuilder();
        for (char element : charArrayed) {
            if (element == '\0'){
                continue;
            }
            buildString.append(element);
        }

        return buildString.toString();
    }
}
/*ось п'ять завдань для роботи зі строками на мові Java:

5. Задача про перетворення рядка на масив слів: Напишіть метод, який приймає рядок і повертає масив,
в якому кожний елемент - це окреме слово з рядка. Наприклад, якщо на вхід подається "hello world", метод повинен
повернути масив ["hello", "world"].

string function

https://www.w3schools.com/java/java_ref_string.asp*/