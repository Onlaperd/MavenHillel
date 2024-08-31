package Homework_10;

import java.util.Objects;

public class Car {
    String color;
    int wheelsNumber;
    String brand;
    int engineSize;

    public Car(String color, int wheelsNumber, String brand, int engineSize){
        this.color = color;
        this.wheelsNumber = wheelsNumber;
        this.brand = brand;
        this.engineSize = engineSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheelsNumber == car.wheelsNumber && engineSize == car.engineSize && Objects.equals(color, car.color)
                && Objects.equals(brand, car.brand);

    }

    @Override
    public int hashCode() {
        return Objects.hash(color, wheelsNumber, brand, engineSize);
    }
}
