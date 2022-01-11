package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = 'a';
            int count = 0;

            for (int i = 0; i < str.length(); i++) {  // compares the char that other loop picked,with each char in the string
                char each = str.charAt(i);

                if(ch == each){
                    count++;
                }
            }
           if(count == 1){
               result += ch;
           }

        }
        System.out.println(result);

    }
}
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

 */