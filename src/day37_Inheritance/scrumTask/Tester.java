package day37_Inheritance.scrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String company){
        super(name, age, gender, jobTitle, id, salary, company);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating a ticket");
    }


    public void fixBug(){
        System.out.println(jobTitle + " " +name + "is fixing bugs");
    }


}
