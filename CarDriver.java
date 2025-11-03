package OOP_A2;

/**
 * CarDriver.java
 * Driver class to test the Car, NewCar, and UsedCar implementations.
 * Demonstrates inheritance, method overriding, and object comparison.
 * 
 * Author: Eddie C.
 * Date: 01-Nov-2025
 */

import static java.lang.System.out;

public class CarDriver {

    public static void main(String[] args) {

        NewCar new1 = new NewCar(8000.33, "silver");
        NewCar new2 = new NewCar(8000.33, "silver");

        if (new1.equals(new2)) {
            new1.display();
        }

        UsedCar used1 = new UsedCar(2500, 100000);
        UsedCar used2 = new UsedCar(2500, 100000);

        if (used1.equals(used2)) {
            used1.display();
        }
    }

}
