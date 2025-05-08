package ArrayQuestions;

import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] ans = new int[2 * n];
        for(int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        for(int i = 0; i < n; i++) {
            ans[n + i] = arr[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
