import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0,2,8,6,4,7,5,0,1,0,99,0};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }

    static void moveZeroes(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
