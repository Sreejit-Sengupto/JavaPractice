import java.util.Scanner;

public class EvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :" + " ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements in the Array" + " ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print(numOfEven(array));
    }

    static int numOfEven(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (numberOfDigits(array[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int numberOfDigits(int n) {
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        return c;
    }
}
