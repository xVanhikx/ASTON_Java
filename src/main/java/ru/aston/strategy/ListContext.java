package ru.aston.strategy;

import java.util.ArrayList;

public class ListContext<T> {
    private FillStrategy<T> strategy;

    public void setStrategy(FillStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public ArrayList<T> fillArray(int size) {
        if (strategy == null) {
            throw new IllegalStateException("Стратегия не установлена");
        }
        return strategy.fillList(size);
    }
}
