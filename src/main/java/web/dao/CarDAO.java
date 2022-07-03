package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;

    {
     cars = new ArrayList<>();

     cars.add(new Car(1, "Ford Mustang", 4_000_000.0));
     cars.add(new Car(2, "Ford Expedition", 2_550_000.0));
     cars.add(new Car(3, "Ford Mondeo", 599_000.0));
     cars.add(new Car(4, "Ford Ecosport", 1_599_000.0));
     cars.add(new Car(5, "Ford Galaxy", 900_000.0));
    }

    public List<Car> printCars() {
        return cars;
    }

    public List<Car> getCarsById(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
