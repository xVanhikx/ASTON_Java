package ru.aston.strategy.car;

import ru.aston.entity.Car;
import ru.aston.strategy.FillStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CarManualFillStrategy implements FillStrategy<Car> {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public ArrayList<Car> fillList(int size) {
        ArrayList<Car> cars = new ArrayList<>();
        try {
            for (int i = 0; i < size; i++) {
                System.out.println("Введите данные для автомобиля " + (i + 1) + ":");
                System.out.print("Мощность (л.с.): ");
                int power = Integer.parseInt(reader.readLine());
                System.out.print("Модель: ");
                String model = reader.readLine();
                System.out.print("Год выпуска: ");
                int year = Integer.parseInt(reader.readLine());
                cars.add(new Car(power, model, year));
            }
        } catch (IOException e) {
            System.out.println("Введены некорректные данные.");
        }
        return cars;
    }
}
