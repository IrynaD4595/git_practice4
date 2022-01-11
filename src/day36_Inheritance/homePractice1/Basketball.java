package day36_Inheritance.homePractice1;

public class Basketball extends Sport{

    public static void main(String[] args) {

        Basketball basketball = new Basketball();
        basketball.setInfo("Chicago Ramblers", 5, 0,"Bouncing the ball");
        basketball.play();
        System.out.println(basketball);


    }
}
