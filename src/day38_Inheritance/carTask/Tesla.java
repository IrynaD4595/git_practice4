package day38_Inheritance.carTask;

public class Tesla extends Car{

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " in autopilot mode.");
    }

    @Override
    public void start() {
        super.start();
    }
}
/*
Tesla:
                extra methods:
                    autoPilot();
 */
