package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarServiceImp implements CarService{

    //
    private List<Car> cars;
    @Autowired
    public CarServiceImp() {
        //create cars
        cars = new ArrayList<>();

        cars.add(new Car("RX", 300, 1995));
        cars.add(new Car("RXS", 303, 1999));
        cars.add(new Car("RXV", 304, 1997));
        cars.add(new Car("RXL", 300, 1996));
        cars.add(new Car("RXM", 301, 1995));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 5) {
            List<Car> cars1 = cars.stream().limit(count).collect(Collectors.toList());
            return cars1;
        }
        return cars;
    }

//    @Override
//    public List<Car> getCars() {
//        return cars;
//    }

}
