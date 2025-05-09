package ArrayQuestions;

public class UpdateArray {
    public static void main(String[] args) {


        int[] arr = {2, 3, 4, 5, 6};
        int n = arr.length;
//        int[] ans = new int[n];
//
//        for (int i = 0; i < n; i++) {
//
//            if (i == 0) {
//                ans[i] = arr[i] * arr[i + 1];
//            }
//            else if (i == n-1) {
//                ans[i] = arr[i] * arr[i - 1];
//            }
//            else{
//                ans[i] = arr[i - 1] * arr[i + 1];
//            }

//        System.out.print(ans[i] + " ");

        updateArray(arr, n);

    }
    public static void updateArray(int[] arr, int n) {
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){

            if(i == 0){
                ans[i] = arr[i] * arr[i+1];
            }
            else if(i == n-1){
                ans[i] = arr[i] * arr[i-1];
            }
            else{
                ans[i] = arr[i - 1] * arr[i + 1];
            }

            System.out.print(ans[i] + " ");

        }
    }

}
