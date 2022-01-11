package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfTheDay(10);
    }








    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDay(int num){

        if(num < 1 || num > 7){
            System.out.println("Invalid");
            return;  // exits nameOfDays method
        }

        if(num == 1){
            System.out.println("Monday");
        }else if( num == 2){
            System.out.println("Tuesday");
        }else if(num == 3){
            System.out.println("Wednesday");
        }else if(num == 4){
            System.out.println("Thursday");
        }else if(num == 5){
            System.out.println("Friday");
        }else if(num == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
    }


}
