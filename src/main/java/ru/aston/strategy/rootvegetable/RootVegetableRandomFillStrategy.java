package ru.aston.strategy.rootvegetable;

import ru.aston.entity.RootVegetable;
import ru.aston.strategy.FillStrategy;

import java.util.ArrayList;
import java.util.Random;

public class RootVegetableRandomFillStrategy implements FillStrategy<RootVegetable> {
    private final Random random = new Random();

    @Override
    public ArrayList<RootVegetable> fillList(int size) {
        ArrayList<RootVegetable> vegetables = new ArrayList<>();
        String[] types = {"Морковь", "Картофель", "Свекла", "Редис", "Редька", "Репа",
                          "Сельдерей", "Петрушка", "Пастернак", "Хрен"};
        String[] colors = {"Оранжевый", "Красный", "Желтый", "Фиолетовый", "Зеленый",
                           "Голубой", "Синий", "Бежевый", "Розовый", "Белый"};
        for (int i = 0; i < size; i++) {
            String type = types[random.nextInt(types.length)];
            double weight = random.nextDouble() * 2;
            String color = colors[random.nextInt(colors.length)];
            vegetables.add(new RootVegetable(type, weight, color));
        }
        return vegetables;
    }
}
