package com.codegym.car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda","Skyativ 6");
        System.out.println(Car.numberOfCars);
    }
}
