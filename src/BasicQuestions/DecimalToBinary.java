package BasicQuestions;

import java.util.Arrays;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 13;

        String str = "";
        while (num != 0) {
            int binary = num % 2;
            str += binary;
            num = num / 2;
        }

        System.out.println(str);



    }
}
