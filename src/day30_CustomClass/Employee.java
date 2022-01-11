package day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String empName, char empGender, int empID, String empJobTitle, double empSalary,
                        boolean empIsFullTime){
        name = empName;
        gender = empGender;
        ID = empID;
        jobTitle = empJobTitle;
        salary = empSalary;
        isFullTime = empIsFullTime;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working");
    }




}
