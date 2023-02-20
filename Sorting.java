import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 1, 5};
        // bubble(array);
        // selection(array);
        // insertion(array);
        // cycle(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubble(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSwapped = true;
                } 
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = findMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }


    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void cycle(int[] arr) {
        for(int i = 0; i < arr.length;) {
            if(i == arr[i] - 1) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[start]) {
                max = i;
            }
        }
        return max;
    }
}
