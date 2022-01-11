package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatementsIntro {
    public static void main(String[] args) {

        for (int i = 'A'; i <= 'Z' ; i++) {

            System.out.println(i + " ");

            if(i == 'F') {
                break;
            }
        }
        System.out.println();

        System.out.println("---------------------------");

        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num < 0){
                break;


            }
            scan.close();
        }







    }
}
