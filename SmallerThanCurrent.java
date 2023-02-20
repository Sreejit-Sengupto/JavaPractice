import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] array = {6, 5, 4, 8};
        System.out.println(Arrays.toString(smallerNumbers(array)));
    }

    static int[] smallerNumbers(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int element : arr) {
                if (arr[i] > element) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
