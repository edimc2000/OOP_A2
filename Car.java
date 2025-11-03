package OOP_A2; 

/**
 * Car.java
 * Superclass representing a generic car with a base price calculation.
 * Demonstrates inheritance and constructor chaining in subclasses.
 * Author: Eddie C.
 * Date: 01-Nov-2025
 */

public class Car {

    private double price;

    public double getPrice() {
        return price;
    }

    Car(double cost) {
        this.price = cost * 2;
    }

}
