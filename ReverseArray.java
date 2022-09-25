import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int start = 0;
        int end = size-1;
        
        System.out.println(Arrays.toString(array));
        
        while(start<end) {
            ValueSwap.swap(array, start, end);
            start++;
            end--;
        }

        System.out.print(Arrays.toString(array));
    }
}
