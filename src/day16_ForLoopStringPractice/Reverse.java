package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String result = "";
        /*
        result += str.charAt(11);
        result += str.charAt(10);
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);
*/
        for (int i = str.length()-1; i >= 0 ; i--) {  // i: index numbers of str (starting last index to index 0)
            result += str.charAt(i);

        }


        System.out.println(result);
    }
}
/*
Write a program that can reverse a String
input: Wooden Spoon
output: noopS nedooW
 */