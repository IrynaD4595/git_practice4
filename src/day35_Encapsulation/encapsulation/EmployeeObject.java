package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 26, 120000);
        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2 = new Employee("Margaret", 'F', 27, 125000);
        employee2.setSalary(employee2.getSalary() + 15000);
        System.out.println(employee2);





    }
}
