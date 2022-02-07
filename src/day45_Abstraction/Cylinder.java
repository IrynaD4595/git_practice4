package day45_Abstraction;

public class Cylinder extends Shape implements Volume{

    public Cylinder(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public double volume(){
        return 0;
    }
}
