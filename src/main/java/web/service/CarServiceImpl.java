package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;


public class CarServiceImpl implements CarService{

    private List<Car> carsList;

    {
        carsList = new ArrayList<>();

        carsList.add(new Car(1, "Ford", "Mustang"));
        carsList.add(new Car(2, "MB", "AMG520"));
        carsList.add(new Car(3, "Chevrolet", "Camaro"));
        carsList.add(new Car(4, "Mazda", "7"));
        carsList.add(new Car(5, "Kia", "K7"));
        carsList.add(new Car(6, "Mazda", "7"));

    }

    public CarServiceImpl(){}


    public List<Car> getCarList() {
        return carsList;
    }

}

