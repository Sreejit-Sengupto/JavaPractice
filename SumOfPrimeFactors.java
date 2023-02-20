public class SumOfPrimeFactors {
    public static void main(String[] args) {
        System.out.println(smallestValue(8));
    }

    static int smallestValue(int n) {
        int sum = 0;
        while(n > 1) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0 && isPrime(i)) {
                    sum += i;
                    n /= sum;
                }
            }
        }
        return sum;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while(c*c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}