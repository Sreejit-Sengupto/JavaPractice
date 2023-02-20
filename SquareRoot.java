public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f", sqrt(40));
    }

    static double sqrt(int n) {
        int start = 0;
        int end = n;
        double root = 0.0;
        int p = 3;

        // For perfect square
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid*mid == n) {
                root = mid;
            }

            if (mid*mid > n) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        // For rest of the numbers
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root < n) {
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
