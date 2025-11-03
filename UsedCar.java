package OOP_A2;


/**
 * UsedCar.java
 * Represents a used car with mileage information, derived from Car.
 * Implements equality and display functionality for output.
 * Author: Eddie C.
 * Date: 01-Nov-2025
 */

import static java.lang.System.out;

import OOP_A2.Helper;

public class UsedCar extends Car {

    int mileage;

    UsedCar(double cost, int mileage) {
        super(cost);
        this.mileage = mileage;
    }

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

    public void display() {
        String price = String.valueOf(Helper.formatTwoDecimals(this.getPrice()));
        String mileage = String.valueOf(Helper.formatCommas(this.mileage));
        out.println(String.format("price = $ %s, mileage = %s ", price, mileage));

    }

}
