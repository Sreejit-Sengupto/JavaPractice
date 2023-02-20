import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] array = {37,12,28,9,100,56,80,5,12};
        insertionSort1(array);
    }

    static void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    static void insertionSort1(int[] arr) {
        int upper = arr[arr.length - 1];
        for (int i = arr.length - 2; i >=0; i--) {
            if(arr[i] > upper) {
                arr[i + 1] = arr[i];
                printArray(arr);
            } else {
                arr[i + 1] = upper;
                printArray(arr);
                break;
            }
        }
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
}