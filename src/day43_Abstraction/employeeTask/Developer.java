package day43_Abstraction.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName() + " is developing application.");
    }

    public void sleep(){
        System.out.println(getName() + " sleep 6 hours.");
    }

    public void unitTest(){
        System.out.println(getName() + " is unit testing.");
    }
}
