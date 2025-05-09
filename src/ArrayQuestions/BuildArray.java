package ArrayQuestions;

import java.util.Arrays;


// create a new array ans where each element ans[i] is equal to nums[nums[i]] for every i from 0 to nums.length-1.
// finally returns the array ans.

public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums, 6)));
    }

    public static int[] buildArray(int[] nums, int n) {

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
