public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSum(arr));
    }

    static int maxSum(int[] arr) {
        int max_sum = arr[0];
        int curr_sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr_sum = (int)(Math.max(arr[i], curr_sum + arr[i]));
            max_sum = (int)(Math.max(curr_sum, max_sum));
        }

        return max_sum;
    }
}
