package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        Car car1 = new Car("model1", 1,1);
        Car car2 = new Car("model2", 2,2);
        Car car3 = new Car("model3", 2,2);
        Car car4 = new Car("model4", 2,2);
        Car car5 = new Car("model5", 2,2);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
