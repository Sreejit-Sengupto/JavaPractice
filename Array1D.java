import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :" + " ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // for(int i=0; i<size; i++) {
        // System.out.print(array[i] + " ");
        // }

        System.out.print(Arrays.toString(array));

    }
}
