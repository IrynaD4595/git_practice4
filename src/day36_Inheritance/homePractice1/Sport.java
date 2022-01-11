package day36_Inheritance.homePractice1;

public class Sport {

    public String name;
    public int numberOfPlayers, numberOfRefer;
    public String rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefer, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefer = numberOfRefer;
        this.rules = rules;
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefer=" + numberOfRefer +
                ", rules='" + rules + '\'' +
                '}';
    }
}
