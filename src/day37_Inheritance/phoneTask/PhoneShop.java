package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "Iphone 12 Pro Max", "6.7 inches", 1300, "Silver" );

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(789654764);
        iphone.faceTime("yahoo@gmail.com");

        Samsung samsung = new Samsung("Samsung", "Galaxy S19", "6 inches", 1000, "Black");

        samsung.call(911);
        samsung.text(453765435);
        samsung.freeze();

        Nokia nokia = new Nokia("Nokia", "3600", "4 inches", 100, "Gray" );

        nokia.call(645358994);
        nokia.text(765458900);
        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);










    }
}
