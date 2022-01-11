package practice_12_01_21;

public class PatienceInfo {
    public static void main(String[] args) {

       String name = "John";
       int age = 38;
       char gender = 'M';
       String dateOfBirth = "12/01/1983";
       boolean isMarried = true;
       String phoneNumber = "(123)456-7890";
       boolean havingInsurance = true;
       String insuranceNumber ="A12300789";
       String employer = "Cydeo";
       double copayWithInsurance = 20.00;
       double copayWithOutInsurance = 250.00;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insuranceNumber = " + insuranceNumber);
        System.out.println("employer = " + employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithOutInsurance = " + copayWithOutInsurance);

        System.out.println("====Escape Sequences====");

        System.out.println("\tname: " + name + "\n\tage: " + age + "\n\tgender: " + gender);

        if(havingInsurance){
            System.out.println("copayWithInsurance = " + copayWithInsurance);
        }else{
            System.out.println("copayWithOutInsurance = " + copayWithOutInsurance);
        }




    }
}
