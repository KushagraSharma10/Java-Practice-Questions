package ArrayQuestions;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter the number you want to find in array: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println( "The Target is found at index of "+ binarySearch(arr,target));

    }

    public static int  binarySearch(int[] arr, int target){

        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid-1;
            else start = mid + 1;

        }

        return -1;
    }
}
