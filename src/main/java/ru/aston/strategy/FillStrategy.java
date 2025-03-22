package ru.aston.strategy;

import java.util.ArrayList;

public interface FillStrategy<T> {
    ArrayList<T> fillList(int size);
}
