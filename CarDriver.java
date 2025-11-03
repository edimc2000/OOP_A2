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

import OOP_A2.Helper;

public class CarDriver {

    public static void main(String[] args) {

        UsedCar mitsu = new UsedCar(5500, 150000);
        UsedCar toyot = new UsedCar(5500, 150000);
        UsedCar hyun = new UsedCar(5500, 150001);

        NewCar tesla = new NewCar(150000, "majestic red");
        NewCar teslaX = new NewCar(150000, "majestic red");
        NewCar teslaX1 = new NewCar(150000, "majestic red1");

        if (mitsu.equals(toyot)) {
            mitsu.display();
        }

        if (tesla.equals(teslaX)) {
            tesla.display();
        }
        


    }

}
