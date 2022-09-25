import java.util.Arrays;
import java.util.Scanner;

public class ValueSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of The Array :" + " ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.print("Enter elments in thr Array :" + " ");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the indices to be swapped :" + " ");
        System.out.print("Enter index  1 :" + " ");
        int index_one = sc.nextInt();
        System.out.print("Enter index 2 :" + " ");
        int index_two = sc.nextInt();

        System.out.println("Original Array" + " " + Arrays.toString(array));
        System.out.print("Swapped Array" + " ");
        swap(array, index_one, index_two);
        System.out.print(Arrays.toString(array));

    }

    static void swap(int[] array, int index_one, int index_two) {
        int temp = array[index_one];
        array[index_one] = array[index_two];
        array[index_two] = temp;
    }
}
