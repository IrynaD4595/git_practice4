package day12_Scanner;

import java.util.Scanner;

public class AllMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter building number: ");
        String building = input.next();

        input.nextLine();

        System.out.println("Enter street name: ");
        String street = input.nextLine();

        System.out.println("Enter city name: ");
        String city = input.nextLine();

        System.out.println("Enter state: ");
        String state = input.next();

        System.out.println("Enter zip code: ");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter country name: ");
        String country = input.nextLine();


        input.close();





    }
}
