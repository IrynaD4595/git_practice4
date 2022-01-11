package day35_Encapsulation.homePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            return;
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price < 0){
            return;
        }else if(price == 0){
            System.out.println("free");
        }
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }


    public static void main(String[] args) {

        Candy candy1 = new Candy("Roshen", 1,5, true);
        Candy candy2 = new Candy("Svitoch", 2,4,false);
        Candy candy3 = new Candy("Milka", 3,3,true);
        Candy candy4 = new Candy("Hershey's",2,2.40,false);

        ArrayList<Candy> candyList = new ArrayList<>();
        candyList.addAll(Arrays.asList(candy1,candy2,candy3,candy4));

        for (Candy each : candyList) {
            System.out.println(each.getBrand() + " : " + each.getPrice());
        }





    }
}
/*
1. CandiesTask
         1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0
 */
