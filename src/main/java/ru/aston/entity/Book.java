package ru.aston.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Book {

    private String author;
    private String title;
    private Integer pageCount;
}
