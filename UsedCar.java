package OOP_A2;

/**
 * UsedCar.java
 * Represents a used car with mileage information, derived from Car.
 * Implements equality and display functionality for output.
 * 
 * Author: Eddie C.
 * Date: 01-Nov-2025
 */

import static java.lang.System.out;

import OOP_A2.Helper;

public class UsedCar extends Car {
    
    /**
     * The mileage (odometer reading) of the used car.
     */
    int mileage;

    /**
     * Constructs a UsedCar object with the specified cost and mileage.
     * Calls the superclass constructor to calculate the price.
     *
     * @param cost    the base cost of the car
     * @param mileage the odometer reading of the car
     */
    UsedCar(double cost, int mileage) {
        super(cost);
        this.mileage = mileage;
    }

    /**
     * Compares this UsedCar object to another object for equality.
     * Two UsedCar objects are considered equal if both their mileage
     * and price values are the same.
     *
     * @param obj the object to compare with this UsedCar
     * @return true if both UsedCar objects have the same mileage and price, false
     *         otherwise
     */
    @Override
    public boolean equals(Object obj) {

        // checking for equality memory reference
        if (this == obj) {
            return true;
        }

        // checking for param if null or not equal with instance
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // compare individual parameter values
        boolean mileage = this.mileage == ((UsedCar) obj).mileage;
        boolean cost = this.getPrice() == ((UsedCar) obj).getPrice();

        return mileage && cost;
    }

    /**
     * Displays the car's price and mileage.
     */
    public void display() {
        String price = Helper.formatTwoDecimals(this.getPrice());
        String mileage = Helper.formatCommas(this.mileage);
        out.println(String.format("price = $%s, mileage = %s ", price, mileage));

    }

}
