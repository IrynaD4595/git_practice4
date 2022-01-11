package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] result = reverse(array);
        System.out.println(Arrays.toString(result));

    }

    //reverse the array, returns a new array
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //reverse the array, returns a new array
    public static double[] reverse(double[] arr){
        double[] result = new double[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //reverse the array, returns a new array
    public static char[] reverse(char[] arr){
        char[] result = new char[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    //reverse the array, returns a new array
    public static String[] reverse(String[] arr){
        String[] result = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
