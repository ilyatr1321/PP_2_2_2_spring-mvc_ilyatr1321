package web.DaoCars;

import lombok.Data;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Component
public class CarsDao {


    private List<Car> cars = Arrays.asList(
            new Car("BMW", "red", 2000),
            new Car("AUDI", "green", 2010),
            new Car("GMC", "blue", 1985),
            new Car("FIAT", "black", 2020),
            new Car("VOLVO", "white", 2012));

    public List<Car> getCars(int count) {
        if (count < 5) {
            return cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        } else {
            return cars;
        }
    }

    public void addCar(Car car) {
        cars.add(car);
    }


}