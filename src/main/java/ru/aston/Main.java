package ru.aston;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        //Сначала выбираем класс с которым будем работать
        while (running) {
            System.out.println("Выбираем класс для работы:");
            System.out.println("1. Автомобиль");
            System.out.println("2. Книга");
            System.out.println("3. Корнеплод");
            System.out.println("0. Выход");
            int classChoice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера ввода

            if (classChoice == 0) {
                running = false;
                System.out.println("Выход из программы.");
                continue;
            }

            // Выбираем действие для выбранного класса
            boolean classRunning = true;
            while (classRunning) {
                switch (classChoice) {
                    case 1:
                        System.out.println("Выберите действие для автомобиля:");
                        System.out.println("1. Заполнить данные");
                        System.out.println("2. Сортировать автомобили");
                        System.out.println("3. Найти автомобиль");
                        System.out.println("4. Записать в файл");
                        System.out.println("0. Вернуться к выбору класса");
                        break;

                    case 2:
                        System.out.println("Выберите действие для книги:");
                        System.out.println("1. Заполнить данные");
                        System.out.println("2. Сортировать книги");
                        System.out.println("3. Найти книгу");
                        System.out.println("4. Записать в файл");
                        System.out.println("0. Вернуться к выбору класса");
                        break;

                    case 3:
                        System.out.println("Выберите действие для корнеплода:");
                        System.out.println("1. Заполнить данные");
                        System.out.println("2. Сортировать корнеплоды");
                        System.out.println("3. Найти корнеплод");
                        System.out.println("4. Записать в файл");
                        System.out.println("0. Вернуться к выбору класса");
                        break;

                    default:
                        System.out.println("Некорректный выбор класса.");
                        classRunning = false;
                        continue;
                }

                int actionChoice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера ввода

                switch (actionChoice) {
                    case 1:
                        // Реализация заполнения данными
                        break;
                    case 2:
                        // Реализация сортировки
                        break;
                    case 3:
                        // Реализация поиска
                        break;
                    case 4:
                        // Реализация записи в файл
                        break;
                    case 0:
                        classRunning = false; // Вернуться к выбору класса
                        break;

                    default:
                        System.out.println("Некорректный выбор действия");
                }
            }
        }
        scanner.close();
    }

    // Реализация заполнения данными
    private static void fillData(Scanner scanner) {
        System.out.println("Выберите способ заполнения:");
        System.out.println("1. Из файла");
        System.out.println("2. Рандомно");
        System.out.println("3. Вручную");
        int fillChoice = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера ввода

        switch (fillChoice) {
            case 1:
                // Реализация заполнения из файла
                break;
            case 2:
                // Реализация заполнения рандомными данными
                break;
            case 3:
                // Реализация заполнения вручную
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }

    // Реализация метода сортировки
    private static void sortData() {

    }

    // Реализация метода поиска
    private static void searchElement() {

    }

    // Реализация метода заполнения из файла
    private static void loadDataFromFile() {

    }

    // Реализация метода для заполнения рандомными данными
    private static void loadRandomData() {

    }

    // Реализация метода для заполнения вручную Car
    private static void addCar() {

    }

    // Реализация метода для заполнения вручную Book
    private static void addBook() {

    }

    // Реализация метода для заполнения вручную RootVegetable
    private static void addRootVegetable() {

    }

    // Реализация метода записи в файл
    private static void writeDataToFile() {

    }

}