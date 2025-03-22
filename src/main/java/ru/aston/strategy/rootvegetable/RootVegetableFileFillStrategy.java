package ru.aston.strategy.rootvegetable;

import ru.aston.entity.RootVegetable;
import ru.aston.strategy.FillStrategy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RootVegetableFileFillStrategy implements FillStrategy<RootVegetable> {
    private final String filePath;

    public RootVegetableFileFillStrategy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public ArrayList<RootVegetable> fillList(int size) {
        ArrayList<RootVegetable> vegetables = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < size; i++) {
                String line = reader.readLine();
                String[] split = line.split(",");
                String type = split[0].trim();
                double weight = Double.parseDouble(split[1].trim());
                String color = split[2].trim();
                vegetables.add(new RootVegetable(type, weight, color));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filePath);
        } catch (IOException ex) {
            System.out.println("Данные в файле некорректны");
        }
        return vegetables;
    }
}
