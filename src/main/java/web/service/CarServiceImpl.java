package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    @Override
    public List<Car> getCountedCars(int count) {
        return carDAO.getCountedCars(count);
    }
}
