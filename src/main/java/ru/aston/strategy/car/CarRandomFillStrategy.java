package ru.aston.strategy.car;

import ru.aston.entity.Car;
import ru.aston.strategy.FillStrategy;

import java.util.ArrayList;
import java.util.Random;

public class CarRandomFillStrategy implements FillStrategy<Car> {
    private final Random random = new Random();

    @Override
    public ArrayList<Car> fillList(int size) {
        ArrayList<Car> cars = new ArrayList<>();
        String[] models = {"Toyota", "Honda", "Ford", "BMW", "Audi", "Mercedes", "Mazda", "Kia", "Lada", "Volga"};
        for (int i = 0; i < size; i++) {
            int power = random.nextInt(200) + 80;
            String model = models[random.nextInt(models.length)];
            int year = random.nextInt(24) + 2000;
            cars.add(new Car(power, model, year));
        }
        return cars;
    }
}
