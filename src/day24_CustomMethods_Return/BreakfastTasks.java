package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
       initials("Wooden", "Spoon");
        System.out.println("----------------------------------");

       domain("Cydeo.School@gmail.com");
       System.out.println("----------------------------------");

       nameOfTheMonths(12);
        System.out.println("----------------------------------");

        nameOfTheDay(5);





    }
    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName){
       String initial = firstName.charAt(0) + "." + lastName.charAt(0);
       initial = initial.toUpperCase();
        System.out.println("Initial = " + initial);
    }

    //2. Create a method that can display the domain of the email
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("Domain = " + domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfTheMonths(int number){
        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number");
        }

    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfTheDay(int num){
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    //5. Create a method that can print how many days a month has





}
