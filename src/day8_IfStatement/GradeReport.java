package day8_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
/*
        System.out.println( true == !false );  //true
        System.out.println( !true != false );  //false
        System.out.println( !false == true );  //true
        System.out.println( !!false );  //false
        System.out.println( ( !!!true )); //false
*/

        int score = 85; // 0 ~ 100
        boolean a = score >= 90 && score <= 100;

        boolean b = score >= 80 && score <= 89;  //boolean b = score >= 80 && score !a;

        boolean c = score >= 70 && score <= 79;  // boolean c = !a && !b && score >= 70;

        boolean d = score >= 60 && score <= 69;

        boolean f = score >= 0 && score <= 59;   //boolean f = !a && !b && !c && !d;

        if(a) {  //if the student made an A
            System.out.println("Excellent");
        }

        if(b) {  //if the student made an B
            System.out.println("Great");
        }

        if(c) {  // if the student made an C
            System.out.println("Good");
        }

        if(d) {  // if the student made an D
            System.out.println("Passed");
        }

        if(f) {  // if the student made an F
            System.out.println("Failed");
        }






    }
}

/*
          90 ~ 100 ==> Excellent
          80 ! 89 ==> Great
          70 ~ 79 ==> good
          60 ~ 69 ==> Passed
          0 ~ 59 ==> Failed

 */