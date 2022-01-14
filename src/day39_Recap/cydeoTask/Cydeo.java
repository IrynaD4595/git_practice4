package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', 123,
                "Java Developer", 130000);

        Tester tester = new Tester("Olga", 26,'F', 234, "SDET", 120000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 345,"Math teacher",
                100000);

        Student student = new Student("Suhaib", 30, 'M', 567,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("---------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("---------------------------------");

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("---------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();

        System.out.println("---------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();

        System.out.println("---------------------------------");








    }
}
/*
Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */