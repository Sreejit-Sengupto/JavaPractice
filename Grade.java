public class Grade {
    public static void main(String[] args) {
        System.out.println(calculate(33));
    }

    static int calculate(int n) {
        int difference = nextMultiple(n) - n;
        if (nextMultiple(n) >= 40 && difference < 3) {
            return nextMultiple(n);
        } else if (nextMultiple(n) >= 40 && difference > 3) {
            return n;
        }
        return n;
    }

    static int nextMultiple(int n) {
        while (n % 5 != 0) {
            n++;
        }
        return n;
    }
}
