package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCountedCars(int count);
    List<Car> getAllCars();
}
