package day8_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int c = b; //15
        b = a;  //10
        a = c;


        System.out.println("a = " + a); //15
        System.out.println("b = " + b); //10

    }
}
/*
 write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

 */