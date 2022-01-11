package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        for(char each : chars){
            System.out.println(each);
        }
        System.out.println("-----------------------------------------");

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------");

        String email = "Wooden Spoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        String s = "Today is a nice day. Today is Monday. Today we are learning Java";

        String[] sentences = s.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }
}
