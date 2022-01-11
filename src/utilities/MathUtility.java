package utilities;

public class MathUtility {

    //Create a method that can return the sum of two integers
    public static int sumOfTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    //Create a method that can return the sum of two decimal numbers
    public static double sumOfTwoNumbers(double num1, double num2){
        return num1 + num2;
    }

    //Create a method that can return the subtraction of two integers
    public static int subtractionOfTwoNum(int num1, int num2){
        return num1 - num2;
    }

    //Create a method that can return the subtraction of two decimals                                        !!!!!
    public static double subtractionOfTwoNum(double num1, double num2){
        return num1 - num2;
    }

    //Creat a method that can return the multiplication of two integers
    public static int multiplicationOfTwoNum(int num1, int num2){
        return num1 * num2;
    }

    //Create a method that can return the multiplication of two decimals
    public static double multiplicationOfTwoNum(double num1, double num2){
        return num1 * num2;
    }

    //Create a method that passes two double parameters and return the division result                       !!!!!
    public static double division(double num1, double num2){
        return num1 / num2;
    }

    //Create a method that can check if an integer is even number                                            !!!!!
    public static boolean evenNumber(int num){
      return (num % 2) == 0;
    }

    //Create a method that can check if an integer is odd number                                             !!!!!
    public static boolean oddNumber(int num){
        return (num % 2) != 0;
    }

    //Create a method that can return the maximum number between two integers
    public static int maxNumber(int num1, int num2){
        return (num1 > num2)? num1 :(num2 > num1)? num2 : num1;
    }

    //Create a method that can return the maximum number between two decimal numbers
    public static double maxNumber(double num1, double num2){
        return (num1 > num2)? num1 :(num2 > num1)? num2 : num1;
    }

    //Create a method that can return the minimum number between two integers
    public static int minNumber(int num1, int num2){
        return (num1 < num2)? num1 :(num2 < num1)? num2 : num1;
    }

    //Create a method that can return the minimum number between two decimal numbers
    public static double minNumber(double num1, double num2){
        return (num1 < num2)? num1 :(num2 < num1)? num2 : num1;
    }

    //Create a method that can return the square of an integer
    public static int square(int n){
        return n * n;
    }

    //Create a method that can return the square of a double
    public static double square(double n){
        return n * n;
    }

    //Create a method that can return the cube of an integer
    public static int cube(int n){
        return n * n * n;
    }

    //Create a method that can return the cube of a double
    public static double cube(double n){
        return n * n * n;
    }








}