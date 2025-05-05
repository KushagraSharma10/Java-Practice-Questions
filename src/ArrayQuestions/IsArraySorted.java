package ArrayQuestions;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
            if(arr[i-1] > arr[i]){
                System.out.println("Array is not sorted in increasing order.");
            }

        }


    }
}
