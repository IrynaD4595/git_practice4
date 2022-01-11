package day30_CustomClass;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Iryna", 'F', 564324, "SDET", 150000,
                true);

        Employee employee2 = new Employee();
        employee2.setInfo("Anastasia", 'F', 564327, "SDET", 140000,
                true);


        Employee employee3 = new Employee();
        employee3.setInfo("Hulya", 'F', 564322, "Server", 50000,
                false);


        Employee employee4 = new Employee();
        employee4.setInfo("Mert", 'M', 564372, "Bartender", 59000,
                true);


        Employee employee5 = new Employee();
        employee5.setInfo("Sergei", 'M', 564392, "Bartender", 55000,
                true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if(employee.isFullTime){
                countFullTime++;

            }else{
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }
            if(employee.salary < min){
                min = employee.salary;
            }
        }


        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("maxSalary = " + max);
        System.out.println("minSalary = " + min);


    }
}
