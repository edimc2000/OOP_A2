package OOP_A2;


/**
 * Car.java
 * Superclass representing a generic car with a base price calculation.
 * Demonstrates inheritance and constructor chaining in subclasses.
 * 
 * Author: Eddie C.
 * Date: 01-Nov-2025
 */

public class Car {

    /**
     * The price of the car, calculated as twice the cost value.
     */
    private double price;

    /**
     * Retrieves the price of the car.
     *
     * @return the calculated price of the car
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Constructs a Car object with the specified cost.
     * The price is determined by multiplying the cost by two.
     *
     * @param cost the base cost of the car
     */
    Car(double cost) {
        this.price = cost * 2;
    }

}
