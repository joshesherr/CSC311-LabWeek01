package org.example;

/**
 * Class that represents a Car.
 * @author Josh
 */
public class Car extends Vehicle{

    private String brand;

    //constructor with parameters
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    /**
     * Makes the car Honk
     */
    public void honk(){
        System.out.println("🚗 Honk, honk! 📢");
    }

    public void displayInfo() {
        System.out.println(
            "Brand: " + getBrand() + "\n"
            + "Wheels: " + getNumberOfWheels() + "\n"
            + "Color: " + getColor() + "\n"
            + "Engine Size: " + getEngineSize() + "\n"
            + "Fuel Type: " + getFuelType()
        );
    }

    //setter and getter for brand
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
