package ru.aston.strategy.book;

import ru.aston.entity.Book;
import ru.aston.strategy.FillStrategy;

import java.util.ArrayList;
import java.util.Random;

public class BookRandomFillStrategy implements FillStrategy<Book> {
    private final Random random = new Random();

    @Override
    public ArrayList<Book> fillList(int size) {
        ArrayList<Book> books = new ArrayList<>();
        String[] authors = {"Лев Толстой", "Фёдор Достоевский", "Александр Пушкин", "Антон Чехов",
                "Николай Гоголь", "Михаил Булгаков", "Михаил Лермонтов", "Иван Тургенев",
                "Александр Куприн", "Александр Солженицын"};
        String[] titles = {"Война и мир", "Преступление и наказание", "Евгений Онегин", "Вишневый сад",
                "Мертвые души", "Мастер и Маргарита", "Мцыри", "Муму", "Юнкера",
                "Архипелаг ГУЛАГ"};
        for (int i = 0; i < size; i++) {
            String author = authors[random.nextInt(authors.length)];
            String title = titles[random.nextInt(titles.length)];
            int pages = random.nextInt(500) + 100;
            books.add(new Book(author, title, pages));
        }
        return books;
    }
}
