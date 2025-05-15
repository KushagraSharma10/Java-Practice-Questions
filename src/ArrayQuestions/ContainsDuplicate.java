package ArrayQuestions;


public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1,2,3};
        System.out.println(hasDuplicate(nums));

    }


    // method - 1
    public static boolean hasDuplicate(int[] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
