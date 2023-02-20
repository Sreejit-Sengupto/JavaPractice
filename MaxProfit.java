public class MaxProfit {
    public static void main(String[] args) {
        int[] array = {2,4,1};
        System.out.println(maxProfit(array));
    }

    static int maxProfit(int[] arr) {
        int minIndex = min(arr);
        int maxIndex = max(arr, minIndex + 1);
        if (maxIndex >= arr.length) {
            return 0;
        }

        return arr[maxIndex] - arr[minIndex];
    }

    static int min (int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    static int max (int[] arr, int start) {
        int max = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
