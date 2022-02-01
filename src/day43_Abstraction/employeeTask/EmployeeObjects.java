package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);

        System.out.println(tester);
        System.out.println(developer);

        tester.sleep();
        tester.work();
        tester.bugReport();
        tester.eat();

        System.out.println("---------------------------");
        developer.sleep();
        developer.unitTest();
        developer.eat();





    }
}
