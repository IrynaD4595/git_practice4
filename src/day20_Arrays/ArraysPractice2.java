package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

    char[] letters = new char[26];

   /* for(char i = 'A', j = 0;  i <= 'Z' && j < letters.length; i++){
        letters[j] = i;
    }

        for (int i = 0, j = 'A'; i < letters.length; i++, j++){
            letters[i] = (char) j;
        }
        System.out.println(Arrays.toString(letters));
*/
        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }
        System.out.println("----------------------------------");

        char[] letters2 = new char[26];

        char ch2='Z';
        for (int i = 0; i <letters2.length;  i++, ch2--) {
            letters2[i]=ch2;

        }
        System.out.println(Arrays.toString(letters2));





    }
}
