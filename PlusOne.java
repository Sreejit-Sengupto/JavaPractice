import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] array = {9,9,9};
        System.out.println(Arrays.toString(plusOne(array)));
    }

    static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else if (allNine(digits)){
            int[] newArray = new int[digits.length + 1];
            int num = 0;
            for (int i = 0; i < digits.length; i++) {
                num = num*10 + digits[i];
            }
            int sum = num + 1;

            for (int i = 0; i < newArray.length; i++) {
                while (sum > 0) {
                    int rem = sum % 10;
                    newArray[i] = rem;
                    sum /= 10;
                }
            }
            return newArray;
        } else {
            int num = 0;
            for (int i = 0; i < digits.length; i++) {
                num = num*10 + digits[i];
            }
            int sum = num + 1;

            int i = digits.length - 1;
            while (i >= 0) {
                while (sum > 0) {
                    int rem = sum % 10;
                    digits[i] = rem;
                    sum /= 10;
                    i--;
                }
            }
            return digits;
        }
    }

    static boolean allNine(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9) {
                count++;
            }
        }
        return count == arr.length;
    }
}
