public class Prime {
    public static void main(String[] args) {
        int n = 11;
        boolean[] nums = new boolean[n + 1];
        primes(n, nums);
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        int c = 2;
        while (c*c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static void primes(int n, boolean[] nums) {
        for (int i = 2; i*i <= n; i++) {
            if (!nums[i]) {
               for (int j = i*2; j <=n; j += i) {
                   nums[j] = true;
               }
            }
        }

        for (int i = 2; i <=n ; i++) {
            if (!nums[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
