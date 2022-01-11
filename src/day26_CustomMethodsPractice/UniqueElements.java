package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));
        System.out.println("-----------------------------------");

        double[] arr2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
        double[] unique2 = uniqueElements(arr2);
        System.out.println(Arrays.toString(unique2));
        System.out.println("-----------------------------------");

    }

    //returns the unique element of the Array as a new Array
    public static int[] uniqueElements(int[] array){
        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){  //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique element of the Array as a new Array
    public static double[] uniqueElements(double[] array){
        double[] result = {};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){  //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique element of the Array as a new Array
    public static char[] uniqueElements(char[] array){
        char[] result = {};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){  //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns the unique element of the Array as a new Array
    public static String[] uniqueElements(String[] array){
        String[] result = {};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){  //if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }





}
