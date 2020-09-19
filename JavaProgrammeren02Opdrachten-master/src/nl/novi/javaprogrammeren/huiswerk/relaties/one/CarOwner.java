package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {
    private String name;
    List<Car> cars;

    public CarOwner(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public CarOwner(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addCar(Car newCar) {
        if (!isInList(newCar)) {
            this.cars.add(newCar);
            System.out.println("auto met kenteken " + newCar.getLicensePlate() + " is aan de lijst toegevoegd!");
            return true;
        }
        System.out.println("auto met kenteken " + newCar.getLicensePlate() + " is al in de lijst, deze auto is NIET toegevoegd!");
        return false;
    }

    private boolean isInList(Car newCar) {
        for (Car car : this.cars) {
            if (car.getLicensePlate().equalsIgnoreCase(newCar.getLicensePlate())) {
                return true;
            }
        }
        return false;
    }

    public void printCars() {
        for (Car car : cars) {
            System.out.println("Merk: " + car.getBrand());
            System.out.println("subtype: " + car.getSubtype());
            System.out.println("kenteken: " + car.getLicensePlate());
            System.out.println("km: " + car.getKmStatus() + "\n");
        }
    }
}
