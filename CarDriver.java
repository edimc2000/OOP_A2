package OOP_A2; 

import static java.lang.System.out;

import OOP_A2.Helper;

public class CarDriver {

    public static void main(String[] args) {

        out.println("test");

        UsedCar mitsu = new UsedCar(5500,150000);
        NewCar tesla = new NewCar(150000, "majestic red"); 

        out.println("new car's price : " + Helper.formatTwoDecimals(tesla.getPrice())); 
    }

}
