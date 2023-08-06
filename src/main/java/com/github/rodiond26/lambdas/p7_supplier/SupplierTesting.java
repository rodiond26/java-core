package com.github.rodiond26.lambdas.p7_supplier;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTesting {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = createThreeCars(() -> new Car("Nissan 1", "Color 1", 1.8));
        System.out.println(cars);
    }
}

@AllArgsConstructor
@ToString
class Car {
    private String model;
    private String color;
    private double engine;
}
