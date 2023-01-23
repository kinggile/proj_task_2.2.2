package web.service;

import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    @Override
    public List<Car> getCountedCars(int count) {
        return carDAO.getCountedCars(count);
    }
}
