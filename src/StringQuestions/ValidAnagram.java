package StringQuestions;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {


        String s = "racecar";
        String t = "carrace";

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        int[] freq = new int[c1.length];

        for (char ch: c1) {
            freq[ch]++;
        }


    }

//    public static boolean isAnagram(String s, String t) {
//
//    }
}
