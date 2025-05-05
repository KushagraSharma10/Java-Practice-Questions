package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("How Many Rotation You want: ");
        int k = sc.nextInt();
        k = k % size;

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i<= k; i++){
            int temp = arr[0];
            for (int j = 0; j < arr.length-1 ; j++) {
                arr[j] = arr[j+1];
            }
            arr[size-1] = temp;
        }

        System.out.println("Array after K rotation is: " + Arrays.toString(arr));
    }
}
