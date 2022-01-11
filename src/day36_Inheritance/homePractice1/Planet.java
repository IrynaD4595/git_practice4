package day36_Inheritance.homePractice1;

public class Planet {

    public String name;
    public double mass, radius, surfaceGravity, surfaceArea;
    public double population;

    public void setInfo(String name, double mass, double radius, double surfaceGravity, double surfaceArea, long population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.population = population;
    }

    public void rolling(){
        System.out.println(name + " is rolling");
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", population=" + population +
                '}';
    }
}
/*
Planet Task:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			methods:
				setInfo()
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
 */