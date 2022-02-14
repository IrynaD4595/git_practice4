package day47_Polymorphism;

import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;
import day44_Abstraction.animals.Animal;
import day44_Abstraction.animals.Cat;
import day44_Abstraction.animals.Dog;
import day45_Abstraction.Circle;
import day45_Abstraction.Cube;
import day45_Abstraction.Shape;
import day45_Abstraction.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4);  //upcasting

        Shape shape2 = new Circle(5);

        //WebDriver driver = (ChromeDriver) new ChromeDriver();

        //Animal dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //Dog dog3 = dog2;

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //Dog dog = (Dog)animal; //downcasting
        //dog.bark();

        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        ( (Dog) animal).bark();

        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());

        System.out.println("-------------------------------------------------");

        Animal animal2 = new Cat("Mala","Manx", 'F', 6, "Small", "Mixed");
        //Cat cat = (Cat) animal2;
        //animal2.meow();

        System.out.println("--------------------------------------------------");

        Employee employee = new Tester("Ali", 30,'M', 435,"SDET", 120000);
        ((Tester)employee).bugReport();

        // ( (Tester)employee).unitTest();
        // ( (Developer)employee).unitTest();

        System.out.println("---------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //((Cube)s1).volume();







    }
}
