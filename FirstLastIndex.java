import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(array, 8)));
    }

    static int[] searchRange (int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[0] = i;
                break;
            } else {
                ans[0] = -1;
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == target) {
                ans[1] = i;
                break;
            } else {
                ans[1] = -1;
            }
        }
        return ans;
    }
}
