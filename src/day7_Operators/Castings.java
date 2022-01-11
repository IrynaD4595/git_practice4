package day7_Operators;

public class Castings {
    public static void main(String[] args) {
     float everageScore = 20.5F;
      byte num1 = (byte)everageScore;     //explicit casting
      short num2 = (short)everageScore;
      int num3 = (int)everageScore;
      long num4 =(long)everageScore;
      float num5 = everageScore;
      double num6 =everageScore;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
    }
}
/*
 create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */