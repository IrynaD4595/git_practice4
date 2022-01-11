package day10_NestedIf;

import javax.security.auth.login.FailedLoginException;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s = 85;
        if(s >= 0 && s <= 100){
          if(s >= 60){
              System.out.println("Passed");
          }else{
              System.out.println("Failed");
          }
        }else{
            System.out.println("Invalid score");
        }


        System.out.println("----------------------------------");

        String result = (s >= 0 && s <= 100)? (s >= 60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result);








    }
}
