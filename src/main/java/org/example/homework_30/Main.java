package org.example.homework_30;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static final String packagePath = "src/main/java/org/example/homework_30/";

    public static void main(String[] args) {
        Object isWritingPossible = new Object();

        Thread fibonacciThread = new Thread(() -> {

            Integer[] twoFibonacciNumbers = new Integer[]{1, 1};
            boolean replaceFirst = true;

            for (int i = 0; i < 13; i++) {
                if (replaceFirst) {
                    twoFibonacciNumbers[0] += twoFibonacciNumbers[1];
                    replaceFirst = false;
                } else {
                    twoFibonacciNumbers[1] += twoFibonacciNumbers[0];
                    replaceFirst = true;
                }
            }

            synchronized (isWritingPossible) {
                try (FileOutputStream outputStream = new FileOutputStream(packagePath + "out.txt", true)) {
                    String toWrite = twoFibonacciNumbers[0] + "\n";
                    outputStream.write(toWrite.getBytes());
                } catch (IOException e) {
                    System.out.println("error: " + e.getMessage());
                }
            }

        });
        Thread sum10Numbers = new Thread(() -> {

            String[] strArray;
            int[] intArray = new int[10];
            try (Scanner inputStream = new Scanner(new FileInputStream(packagePath + "numbers.txt"))) {
                strArray = inputStream.nextLine().split(" ");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            int result = 0;

            for (int integer : intArray) {
                result += integer;
            }

            synchronized (isWritingPossible) {
                try (FileOutputStream outputStream = new FileOutputStream(packagePath + "out.txt", true)) {
                    String toWrite = result + "\n";
                    outputStream.write(toWrite.getBytes());
                } catch (IOException e) {
                    System.out.println("error: " + e.getMessage());
                }
            }


        });
        Thread phonesThread = new Thread(() -> {
            String[] phones;
            StringBuilder toWrite = new StringBuilder();
            try (Scanner inputStream = new Scanner(new FileInputStream(packagePath + "test.txt"))) {
                phones = inputStream.nextLine().split("; ");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            boolean isPhoneValid;

            for (String phone : phones) {
                if (phone.length() == 13 && phone.charAt(0) == '+') {
                    isPhoneValid = getIsPhoneValid(phone);
                    if (isPhoneValid) {
                        toWrite.append(phone).append("\n");
                    }
                }
            }


            synchronized (isWritingPossible) {
                try (FileOutputStream outputStream = new FileOutputStream(packagePath + "out.txt", true)) {
                    outputStream.write(toWrite.toString().getBytes());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        fibonacciThread.start();
        sum10Numbers.start();
        phonesThread.start();

        try {
            fibonacciThread.join();
            sum10Numbers.join();
            phonesThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Всі операції завершені");
    }

    private static boolean getIsPhoneValid(String elem) {
        int isPhoneValid = -12;
        for (int i = 0; i < elem.length(); i++) {
            if (
                    elem.charAt(i) == '1' ||
                            elem.charAt(i) == '2' ||
                            elem.charAt(i) == '3' ||
                            elem.charAt(i) == '4' ||
                            elem.charAt(i) == '5' ||
                            elem.charAt(i) == '6' ||
                            elem.charAt(i) == '7' ||
                            elem.charAt(i) == '8' ||
                            elem.charAt(i) == '9' ||
                            elem.charAt(i) == '0'
            ) {
                isPhoneValid++;
            }
        }
        return isPhoneValid == 0;
    }


}