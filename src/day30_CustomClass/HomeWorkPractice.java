package day30_CustomClass;

import java.util.Scanner;

public class HomeWorkPractice {
    public static void main(String[] args) {

        /*
        1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
         */
        String str = "level";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(str.length()-1);

        System.out.println(ch1 == ch2);

        System.out.println("-----------------------------------------------------");

        /*
        2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S
         */
        String first = "cybertek";
        String last = "school";

        System.out.println(first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0));

        System.out.println("-----------------------------------------------------");

        /*
        3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
         */

        String str1 = "Anastasia ";
        String result = "";

        if(str.isEmpty()){
            result = "String is empty.";
        }else if(str1.length() <= 3){
            result = str1;
        }else{
            System.out.println("" +str1.charAt(str.length()-3) + str1.charAt(str1.length()-2) + str1.charAt(str.length()-1));
        }
        System.out.println(result);

        System.out.println("-----------------------------------------");

        /*
        4. write a program that asks the user enter a 3 letters word. Check if the middle character of the given
        word is 'a'. In the case it is, print: "Cool word", but in the case the middle letter is not 'a' print:
        "Okay word".
        - If the user does not enter a 3 letter word tell them:
        If the word is less than 3 letters: "Word is too short"
        If the word is too long: "Word is too long"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 letters word:");
        String str2 = scan.next();

        if(str2.length() == 3){
            if(str2.charAt(1) == 'a'){
                System.out.println("Cool word.");
            }else {
                System.out.println("Okay Word.");
            }
        }



    }
}
/*
5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"


6. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

        Hints:     In order to login, both username and password MUST be correct
                you will need to use equals() method
 */