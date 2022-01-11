package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //PRINTS EACH integer of an integer array in separate lines
    public static void printEach(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    //PRINTS EACH double of  double array in separate lines
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    //PRINTS EACH character of char array in separate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    //PRINTS EACH String of String array in separate lines
    public static void printEach(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    //find a max number of integer Array
    public static int maxNumberOfArray(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }

    //find a max number of double Array
    public static double maxNumberOfArray(double[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }

    //find a min number of integer Array
    public static int minNumberOfArray(int[] num){
        Arrays.sort(num);
        return num[0];
    }

    //find a min number of double Array
    public static double minNumberOfArray(double[] num){
        Arrays.sort(num);
        return num[0];
    }

    //checks if the given integer is contained in the given Array, returns boolean
    public static boolean isContained(int[] arr, int element){
        boolean result = false;

        for(int each : arr){
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given Array, returns boolean
    public static boolean isContained(double[] arr, double element){
        boolean result = false;

        for(double each : arr){
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given Array, returns boolean
    public static boolean isContained(char[] arr, char element){
        boolean result = false;

        for(char each : arr){
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given Array, returns boolean
    public static boolean isContained(String[] arr, String element){
        boolean result = false;

        for(String each : arr){
            if(each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    //create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length +1];

        int i = 0;
        for(int each : array){
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length+1];

        int i = 0;
        for(double each : array){
            result[i++] = each;
        }
        result[i] = element;// element need to be assigned to the last index
        return result;
    }

    //create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];

        int i = 0;
        for(String each : array){
            result[i++] = each;
        }
        result[i] = element;// element need to be assigned to the last index
        return result;
    }

    //create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length+1];

        int i = 0;
        for(char each : array){
            result[i++] = each;
        }
        result[i] = element;// element need to be assigned to the last index
        return result;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[]array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[]array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[]array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[]array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
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

    //removes the index from the array, returns new array
    public static int[] removeElements(int[] array, int index){
        if(index < 0 || index >= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static double[] removeElements(double[] array, int index){
        if(index < 0 || index >= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static char[] removeElements(char[] array, int index){
        if(index < 0 || index >= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static String[] removeElements(String[] array, int index){
        if(index < 0 || index >= array.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for(int each : arr2){
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for(double each : arr2){
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for(char each : arr2){
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and returns a new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for(String each : arr2){
            result = ArraysUtility.addElement(result, each);
        }
        return result;
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

    //replace the element of the array at the given index with the new elements
    public static int[] replace(int[] array, int index, int newElement){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replace the element of the array at the given index with the new elements
    public static double[] replace(double[] array, int index, double newElement){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replace the element of the array at the given index with the new elements
    public static char[] replace(char[] array, int index, char newElement){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replace the element of the array at the given index with the new elements
    public static String[] replace(String[] array, int index, String newElement){

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }

    //remove the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result = {};

        for (int each : array) {
            if(!ArraysUtility.isContained(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //remove the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result = {};

        for (double each : array) {
            if(!ArraysUtility.isContained(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //remove the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result = {};

        for (char each : array) {
            if(!ArraysUtility.isContained(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //remove the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result = {};

        for (String each : array) {
            if(!ArraysUtility.isContained(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }









}
