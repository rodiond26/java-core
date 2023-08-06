package com.github.rodiond26.lambdas.p8_consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.github.rodiond26.lambdas.Utils.delimiter;

public class ConsumerTesting {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = createThreeCars(() -> new Car("Nissan 1", "Color 1", 1.8));
        System.out.println(cars);
        delimiter();
        changeCar(cars.get(0),
                car -> {
                    car.setColor("red");
                    car.setEngine(2.4);
                    System.out.println("updatedCar=" + car);
                }
        );
        System.out.println(cars);
    }
}

@AllArgsConstructor
@ToString
@Getter
@Setter
class Car {
    private String model;
    private String color;
    private double engine;
}
