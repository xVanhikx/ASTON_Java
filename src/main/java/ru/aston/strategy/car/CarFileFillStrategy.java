package ru.aston.strategy.car;

import ru.aston.entity.Car;
import ru.aston.strategy.FillStrategy;

import java.io.*;
import java.util.ArrayList;

public class CarFileFillStrategy implements FillStrategy<Car> {
    private final String filePath;

    public CarFileFillStrategy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public ArrayList<Car> fillList(int size) {
        ArrayList<Car> cars = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < size && reader.ready(); i++) {
                String line = reader.readLine();
                String[] split = line.split(",");
                int power = Integer.parseInt(split[0].trim());
                String model = split[1].trim();
                int year = Integer.parseInt(split[2].trim());
                cars.add(new Car(power, model, year));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filePath);
        } catch (IOException ex) {
            System.out.println("Данные в файле некорректны");
        }
        return cars;
    }
}
