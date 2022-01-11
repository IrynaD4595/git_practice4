package day36_Inheritance.homePractice1;

public class Football extends Sport{

    public static void main(String[] args) {

        Football football = new Football();
        football.setInfo("Manchester United", 11, 4, "Not allowed to touch the ball");
        football.play();


    }
}
