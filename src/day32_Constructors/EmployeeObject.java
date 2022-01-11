package day32_Constructors;


public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println(employee1);

        Employee employee2 = new Employee("Yuliya", 'F');
        System.out.println(employee2);

        Employee employee3 = new Employee("Iryna", 'F', "SDET");
        System.out.println(employee3);



    }
}
