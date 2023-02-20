public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < nums.length) {
            while (start < end) {
                if (nums[start] == nums[end]) {
                    return true;
                } else {
                    end--;
                }
                start++;
                end = nums.length - 1;
            }
        }
        return false;
    }
}
