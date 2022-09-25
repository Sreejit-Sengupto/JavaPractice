import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = { 0 };
        System.out.print((Arrays.toString(plusOne(array))));
    }

    static int[] plusOne(int[] digits) {
        if (digits.length >= 1 && digits.length <= 100) {
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] >= 0 && digits[i] <= 9 ) {

                    if (digits[digits.length - 1] == 9) {
                        int size = digits.length + 1;
                        int[] newArray = new int[size];
                        for (int j = 0; j < digits.length; j++) {
                            newArray[j] = digits[j];
                        }
                        newArray[size - 1] = 0;
                        newArray[size - 2] = 1;
                        return newArray;
                    }
                     else {
                        digits[digits.length - 1] = digits[digits.length - 1] + 1;
                        break;
                    }
                }
            }
        }
        return digits;
    }
}
