package org.example.homework_28;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "src/main/java/org/example/homework_28/";

        System.out.print("Введіть текст: ");
        String UserInput = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(path + "output.txt")) {
            fileWriter.append(UserInput);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено!");
        } catch (IOException e) {
            System.out.println("щось пішло не так: " + e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "output.txt"))) {
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено!");
        } catch (IOException e) {
            System.out.println("щось пішло не так: " + e.getMessage());
        }

        String source = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "source.txt"))) {
            source = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено!");
        } catch (IOException e) {
            System.out.println("щось пішло не так: " + e.getMessage());
            source = "error: " + e.getMessage();
        }

        try (FileWriter fileWriter = new FileWriter(path + "destination.txt")) {
            fileWriter.append(source);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено!");
        } catch (IOException e) {
            System.out.println("щось пішло не так: " + e.getMessage());
        }

        SomeClass someClass = new SomeClass("some name");


        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path + "somefile"))) {
            outputStream.writeObject(someClass);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено!");
        } catch (IOException e) {
            System.out.println("шось пішло не так: " + e);
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path + "somefile"))) {
            System.out.println(inputStream.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено!");
        } catch (IOException e) {
            System.out.println("шось пішло не так: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("клас SomeClass не знайдено!");
        }
    }
}