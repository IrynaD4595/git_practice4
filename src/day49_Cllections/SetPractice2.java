package day49_Cllections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon",
                "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towel"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]);

        System.out.println(set1);

        System.out.println("---------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        



    }
}
