package org.example;

public class Main {
    public static void main(String[] args) {

        Car newCar = new Car(3, "Red",4.5f,"Solar", "BMW");

        newCar.displayInfo();

        System.out.print("\n");

        newCar.honk();
    }
}