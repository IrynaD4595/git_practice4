package day33_Statics;

import java.util.Scanner;

public class HomePractice {
    public static void main(String[] args) {
        /*
        1)  check if a string is build out of the same letters as another string.
        Ex:  same("abc",  "cab"); -> true
        same("abc",  "abb"); -> false:
         */
      String str1 = "rac";
      String str2 = "cab";
      String result1 = "";
      String result2 = "";

     for (int i =0; i< str1.length(); i++){
         result1 = "" + str1.charAt(i);
        }
     for (int i = 0; i < str2.length(); i++){
         result2 = ""+ str2.charAt(i);
     }

      if(str1.contains(result2) && str2.contains(result1) && str1.length() == str2.length()){
          System.out.println("Same");
      }else{
          System.out.println("Not Same");
      }

        System.out.println("--------------------------------------");

      /*
      2) remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC/
       */
        String str = "AAABBBCCC";
        String result = "";


        for(int i = 0; i < str.length(); i++){
           String ch  = "" + str.charAt(i);

           if(!result.contains(ch)){
               result += ch;
           }
        }
        System.out.println(result);

        System.out.println("----------------------------------------");

        /*
        3)  verify if a password is valid or not.requirements:
               1. Password MUST be at least have 6 characters and should not contain space
               2. PassWord should at least contain one upper case letter
               3. PassWord should at least contain one lowercase letter
               4. Password should at least contain one special characters
               5. Password should at least contain a digit/
         */

        String password = "Myroslava2014";
        String result3 = "";

        boolean r1 = false;
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        boolean passwordIsStrong = false;

        if(password.length() >= 6 && !password.contains(" ")){
            for(int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);
                if(ch >= 'A' && ch <= 'Z'){
                    r1 = true;
                }else if(ch >= 'a' && ch <= 'z'){
                    r2 = true;
                }else if(ch >= 0 && ch <= 9){
                    r3 = true;
                }else if(ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z'){
                    r4 = true;
                }
            }
            if(r1 && r2 && r3 && r4){
                passwordIsStrong = true;
            }
            System.out.println("Password is strong " + passwordIsStrong);

        }else{
            System.out.println("Weak Password " + passwordIsStrong);
        }

        System.out.println("----------------------------------------");

        //4) Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String chars = "AAABBCDD";
        String result4 = "";

        for(int j = 0; j < chars.length(); j++){

            char ch = chars.charAt(j);
            int count = 0;

            for(int i = 0; i < chars.length(); i++){

                char each = chars.charAt(i);
                if(ch == each){
                    count++;
                }
            }
            if(result4.contains("" + ch)){
                continue;
            }

            result4 += ch;
            result4 += count;
        }
        System.out.println(result4);

        System.out.println("---------------------------------------");

        /*
        Ask user to enter two words. Then add them together and print.
        But if the last letter of the first word and the first letter of the last letter is the same,
        print that character once.
        Input:one eight
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words:");
        String w1 = scan.next();
        String w2 = scan.next();
        String mergeWords = "";

        if(w1.charAt(w1.length()-1) == w2.charAt(0)){
            mergeWords = w1.substring(0, w1.length()-1) + w2;
        }
        System.out.println(mergeWords);


scan.close();



    }
}
/*
5) Ask user to enter two words. Then add them together and print.
        But if the last letter of the first word and the first letter of the last letter is the same,
        print that character once.
        Input:one eight
6). Create a class called EmailTask2.
        Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that will print out information about user based on email. Print first name, last name, and domain.
                First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
        Ex: input:craig_federighi@apple.com
        Output:
        First name: Craig
        Last name: Federighi
        Domain: apple
7) In the Fibonacci series, the next number is the sum of previous two numbers. For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc... The first two numbers of the Fibonacci series are 0 and 1. (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)

        You are given a number num, print n-th Fibonacci Number.

        */
