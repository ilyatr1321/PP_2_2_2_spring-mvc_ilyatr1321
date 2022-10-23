package web.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Car {

    private String brand;
    private String color;
    private int year;
}

