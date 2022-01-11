package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Iryna", 'F', 26, "STR040595", 'A');


        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, "RS3468", 'B');

        Student student3 = new Student();
        student3.setInfo("Eminur", 'F', 26, "TKS76970", 'A');

        Student student4 = new Student();
        student4.setInfo("Anastasia", 'F', 30, "TKS7697", 'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 35, "TKS76979", 'C');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if(student.grade == 'A'){
                earlyBirds.add(student);

            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println();
        System.out.println(angryBirds);







    }
}
