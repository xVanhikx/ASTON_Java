package ru.aston.strategy.book;

import ru.aston.entity.Book;
import ru.aston.strategy.FillStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BookManualFillStrategy implements FillStrategy<Book> {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public ArrayList<Book> fillList(int size) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            for (int i = 0; i < size; i++) {
                System.out.println("Введите данные для книги " + (i + 1) + ":");
                System.out.print("Автор: ");
                String author = reader.readLine();
                System.out.print("Название: ");
                String title = reader.readLine();
                System.out.print("Количество страниц: ");
                int pages = Integer.parseInt(reader.readLine());
                books.add(new Book(author, title, pages));
            }
        } catch (IOException e) {
            System.out.println("Введены некорректные данные");
        }
        return books;
    }
}
