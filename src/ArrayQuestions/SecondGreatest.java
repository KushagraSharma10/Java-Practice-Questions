package ArrayQuestions;

import java.util.Scanner;

public class SecondGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int secondHighest = 0;
        int highest = 1;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] > arr[highest]) {
                secondHighest = highest;
                highest = i;
            } else if (arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = i;
            }
        }
        System.out.println("Greatest Element is: " + arr[highest]);
        System.out.println("Second Greatest Element is: " + arr[secondHighest]);
    }
}
