package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
      int score = 67;
      if(score >= 0 && score <= 100){
          if(score >= 90){
              System.out.println("Excellent");
          }else if(score >= 80 && score <= 89){
              System.out.println("Great");
          }else if(score >= 70 && score <= 79){
              System.out.println("Good");
          }else if(score >= 60 && score <= 69){
              System.out.println("Passed");
          }else{
              System.out.println("Failed");
          }
      }else{
          System.out.println("Invalid score");
      }
        System.out.println("------------------------------------------------------------");
        String result = (score >= 0 && score <= 100)? (score >= 90)? "Excellent" :(score >= 80 && score <= 89)? "Great" :
                (score >= 70 && score <= 79)? "Good" :(score >= 60 && score <= 69)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result);
        System.out.println("---------------------------------------------------------------");

    }
}
/*
90~100 : excellent
80~89: great
70~79: good
60~69: passed
0~59: failed

 */