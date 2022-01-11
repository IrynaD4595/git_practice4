package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your Programming language: ");
        String programming = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine(); // capture the Enre key that user pressed for nextInt()

        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();
    }
}
