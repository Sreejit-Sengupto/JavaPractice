import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {10, 12, 12, 14, 15};
        remove(array);
    }

    static void remove(int[] arr) {
        int[] ans = {};
        if (!isDuplicate(arr)) {
            for (int i = 0; i < arr.length; i++) {
                ans[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    static boolean isDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
