package ru.aston.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RootVegetable {

    private String type;
    private Integer weight;
    private String color;
}
