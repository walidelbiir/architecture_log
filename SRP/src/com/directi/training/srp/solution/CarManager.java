package com.directi.training.srp.solution;

public class CarManager {
    private CarDB _carsDb;

    public Car getFromDb(final String carId) {
        for (Car car : _carsDb.getCarsList()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb.getCarsList()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _carsDb.getCarsList()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
