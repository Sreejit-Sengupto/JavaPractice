public class Solution {
    public static void main(String[] args) {
        int[] array = {3, 5};
        System.out.println(specialArray(array));
    }
    static int specialArray(int[] nums) {
        int count = 0;
        for(int i = 1; i < greatest(nums); i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] >= i) {
                    count++;
                }
            }
        }
        return count;
    }

    static int greatest(int[] arr) {
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}