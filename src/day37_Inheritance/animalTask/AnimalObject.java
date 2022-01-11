package day37_Inheritance.animalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog = new Dog("Alex", "Husky", 'M', 3, "Large", "White");
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat("Mala", "Manks", 'F', 6, "Small", "Mixed");
        cat.scratch();
        System.out.println(cat);


    }
}
