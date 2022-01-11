package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Corolla", "Navy Blue", 2013, 14000.75);

        System.out.println(car1);


        Car car2 = new Car();
        car2.setInfo("Ford", "Super Duty", "White", 2021, 75678.99 );

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("BMW", "335IS", "Black", 2020, 50345.60);

        System.out.println(car3);

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for(Car each : carsList){
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("----------------------------------------------------");

        carsList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);








    }
}
