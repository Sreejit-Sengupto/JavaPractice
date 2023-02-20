import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        //Inputing values in the array
        System.out.println("Enter values in the array");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        //Printing original array
        System.out.println(Arrays.toString(array));

        //Sum of the array
        int sum = sum(array);
        System.out.println(sum);

        //Average of the array
        System.out.println(average(array));

        //Number of even numbers in the array
        System.out.println(evenNumbers(array));
    }

    static void reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        //Reversing the array
        for(int i=0; i<arr.length; i++){
            reversedArray[i] = arr[(arr.length-1)-i];
        }
        System.out.println(Arrays.toString(reversedArray));

    }

    static int sum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    static double average(int[] arr){
        return sum(arr)/arr.length;
    }

    static int evenNumbers(int[] arr){
        int count = 0;
        for (int element : arr) {
            if(element%2 == 0){
                count++;;
            }
        }
        return count;
    }

    static int oddSum(int[] arr){
        int sum = 0;
        for (int element : arr){
            if(element%2 != 0){
                sum += element;
            }
        }
        return sum;
    }
}
