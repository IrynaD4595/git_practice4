package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int[] reversed = new int[numbers.length]; // make sure array has enough capacity to contain all the elements

        //         j            i
        //reversed[0] = numbers[3];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reversed));

    }
}
