package day31_Constructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Iryna", 26,'F','A', 12345);

        Student student2 = new Student("Mert", 29, 'M', 'B', 32456);

        System.out.println(student1);
        System.out.println(student2);
    }
}

