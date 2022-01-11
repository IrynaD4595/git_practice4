package day8_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 101;
    boolean evenNumber = number%2 == 0;
    boolean oddNumber = !evenNumber;
    if(evenNumber){                          //even numbers
        System.out.println(number + " is even number");
    }
    if (oddNumber) {
        System.out.println(number + " is odd number");//not even
    }
        System.out.println("_____________________________________________________");

    int n =20;
    if(n > 0){       //positive
        System.out.println(n + " is positive");
    }


    if(n < 0){           //negative
        System.out.println(n + " is");
    }

    if(n == 0){
        System.out.println(n + " is zero");
    }






    }
}


/*
        System.out.println("Odd Number");
        System.out.println("Even Number");

        */