package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 200.5,
                n2 = 10.5;
        char operator = '-';
        String result = "";
        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if(valid){

           switch (operator){
               case '+':
                   result = "n1 + n2";
                   break;
               case '-':
                   result = "n1 - n2";
                   break;
               case '*':
                   result = "n1 * n2";
                   break;
               default:
                   result = "n1 / n2";

           }

        }else{
            result ="Invalid";
        }

        System.out.println(" "+n1 + operator + n2 + "="+ result);







    }
}
