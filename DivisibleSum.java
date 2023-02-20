public class DivisibleSum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(divisibleSumPairs(5, array));
    }

    static int divisibleSumPairs(int k, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] < arr[j]) {
                    if (divisible(arr[i] + arr[j], k)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static boolean divisible(int n, int k) {
        return n % k == 0;
    }
}
