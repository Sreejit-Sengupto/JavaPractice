public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

    static int numSquares(int n) {
        int count = 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (isPerfectSquare(i)) {
                if (n % i == 0) {
                    return n / i;
                } else {
                    ans += i;
                    count++;
                    if (ans == n) {
                        break;
                    }
                }
            }
        }
        return count;
    }

    static boolean isPerfectSquare(double n) {
        double sqrt = (Math.sqrt(n));
        return sqrt - Math.floor(sqrt) == 0;
    }
}
