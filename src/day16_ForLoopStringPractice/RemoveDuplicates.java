package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbaacc";
        String result = ""; //abc

        for (int i = 0; i <= str.length()-1 ; i++) { // i: index numbers of str(starts from 0)
            String ch = "" + str.charAt(i); // each Character of str

            if(!result.contains(ch)){
                result += ch;
            }
        }
        System.out.println(result);








    }
}
