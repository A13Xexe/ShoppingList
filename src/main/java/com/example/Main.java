package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<String> shoppingList = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Добро пожаловать!");
        while (true) {
            System.out.println("""
                    Введите команду:
                        1 - Добавить товар
                        2 - Показать список товаров
                        3 - Очистить список товаров
                        4 - Выход
                    """);

            String command = scanner.next();

            switch (command) {
                case "1" -> addProduct();
                case "2" -> showList();
                case "3" -> clear();
                case "4" -> {
                    System.out.println("До встречи!");
                    return;
                }
                default -> System.out.println("Неверная команда");
            }

        }
    }

    private static void addProduct() {
        System.out.println("Введите название товара:");
        String productName = scanner.next();
        if (shoppingList.contains(productName)) {
            System.out.println("Этот товар уже есть в списке");
        } else {
            shoppingList.add(productName);
            System.out.printf("Товар %s был добавлен под номером %s%n", productName, shoppingList.size());
        }

    }

    private static void showList() {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }

    private static void clear() {
        shoppingList.clear();
        System.out.println("Список очищен");
    }

}