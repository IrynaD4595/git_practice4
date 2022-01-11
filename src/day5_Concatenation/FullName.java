package day5_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Jimmy";
        String lastName = "King";
        int age = 28;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";

        String fullName = firstName + " " + lastName;
//FullName is JobTitle, works at CompanyName...
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName);



    }
}
