public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binToDec("0011"));
    }

    static int binToDec(String n) {
        int num = removeLead(n);
        int sum = 0;
        int size = noOfDigits(num);
        for (int i = 0; i < size; i++) {
                int rem = num % 10;
                num /= 10;
                sum += rem * Math.pow(2, i);
        }
        return sum;
    }

    static int noOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            count++;
        }
        return count;
    }

    static int removeLead(String str) {
        int firstIndex = str.indexOf('1');
        int ans = Integer.parseInt(str.substring(firstIndex, str.length()));
        return ans;
    }
}
