package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[n];

        int i = 0, j = n-1;

        for (int k = 0; k < n; k++) {
            if(arr[k] > 0){
                res[i++] = arr[k];
            }
            else{
                res[j--] = arr[k];
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
