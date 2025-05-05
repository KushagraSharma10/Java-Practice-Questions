package ArrayQuestions;

import java.util.Scanner;

public class GreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > arr[greatest]) {
                greatest = i;
            }
        }

        System.out.println("Greatest Element is: " + arr[greatest] + " at index of " + greatest);
    }
}
