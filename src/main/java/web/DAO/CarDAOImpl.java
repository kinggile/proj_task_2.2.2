package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> carList;

    {
        Car car1 = new Car("model1", 1, 1);
        Car car2 = new Car("model2", 2, 2);
        Car car3 = new Car("model3", 3, 3);
        Car car4 = new Car("model4", 4, 4);
        Car car5 = new Car("model5", 5, 5);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }


    @Override
    public List<Car> getCountedCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}