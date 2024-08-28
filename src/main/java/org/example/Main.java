package org.example;

public class Main {
    public static void main(String[] args) {
        //Instantiate a new car.
        Car newCar = new Car(3, "Red",4.5f,"Solar", "BMW");

        //Display the cars info
        newCar.displayInfo();

        System.out.print("\n");

        //Honk
        newCar.honk();
    }
}