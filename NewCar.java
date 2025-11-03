package OOP_A2;

import static java.lang.System.out;

/**
 * NewCar.java
 * Represents a new car with color information, extending the Car class.
 * Includes equality and display methods for car details.
 * 
 * Author: Eddie C.
 * Date: 01-Nov-2025
 */

public class NewCar extends Car {

    /**
     * The color of the new car.
     */
    String color;

    /**
     * Constructs a NewCar object with the specified cost and color.
     * Calls the superclass constructor to calculate the price.
     *
     * @param cost  the base cost of the car
     * @param color the color of the car
     */
    NewCar(double cost, String color) {
        super(cost);
        this.color = color;
    }

    /**
     * Compares this NewCar object to another object for equality.
     * Two NewCar objects are considered equal if both their color
     * and price values are the same.
     *
     * @param obj the object to compare with this NewCar
     * @return true if both NewCar objects have the same color and price, false
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
        boolean color = this.color.equals(((NewCar) obj).color);
        boolean cost = this.getPrice() == ((NewCar) obj).getPrice();

        return color && cost;
    }

    /**
     * Displays the car's price and color in formatted form.
     */
    public void display() {
        String price = Helper.formatTwoDecimals(this.getPrice());
        out.println(String.format("price = $%s, color = %s ", price, this.color));
    }

}
