package OOP_A2;

import static java.lang.System.out;

public class NewCar extends Car {

    String color;

    NewCar(double cost, String color) {
        super(cost);
        this.color = color;
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
        boolean color = this.color == ((NewCar) obj).color;
        boolean cost = this.getPrice() == ((NewCar) obj).getPrice();

        return color && cost;
    }


      public void display(){
        String price = String.valueOf(Helper.formatTwoDecimals(this.getPrice())); 
            out.println(
        String.format("price = $ %s, color = %s ",  price, this.color)
        );
    }



}
