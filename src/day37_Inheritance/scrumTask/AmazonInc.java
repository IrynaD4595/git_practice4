package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";
        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1234, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 234, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 434, 145000, company);

        Tester tester1=new Tester("Chinara",32,'F',"QA",4356,125000,company);

        Tester tester2=new Tester("Yasaman",31,'F',"QE",654,130000,company);

        Tester tester3=new Tester("Irena",29,'F',"SDET",567,128000,company);

        Tester tester4=new Tester("Cihad",26,'M',"QA",789,125000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Daniela", 27, 'F', "Java Developer", 8,
                135000, company);

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------------");

        for(Tester tester : scrumTeam.testers){
            System.out.println(tester.name + " : " + tester.salary);
        }


    }
}
