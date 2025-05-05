package ArrayQuestions;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter the number you want to search: ");
        int target = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == target) {
                System.out.println(target + " is found at " + i + " index.");
            }
        }
    }
}
