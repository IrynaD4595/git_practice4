package day44_Abstraction.animals;

public final class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {}

    public void play(){

    }

    public void fly(){

    }
}
