package day24_CustomMethods_Return;

public class ReturnMethods_Return {
    public static void main(String[] args) {
        String str = "ccccccccdddddaaaaaabbbbbb";
        str = removeDuplicates(str);
        System.out.println(str);


    }

    // create a method that can remove duplicated characters from a string and returns a new value
    public static String removeDuplicates(String str){  // this method returns the duplicates of any sting
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char each = str.charAt(i);

            if(!result.contains("" + each)){
                result += each;
            }
        }
            return result;
    }

    // create a method that can return th max num from array of integers

    // create a method that can return th min num from array of integers

    //create a method that return the reversed array

    //create a method that can merge two arrays and return the new array

}
