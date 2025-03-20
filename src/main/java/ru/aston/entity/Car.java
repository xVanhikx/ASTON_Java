package ru.aston.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Car {

    private Integer power;
    private String model;
    private Integer year;
}
