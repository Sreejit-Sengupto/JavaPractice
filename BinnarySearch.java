import java.util.Scanner;

public class BinnarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        //Initializing array
        int[] array = new int[size];

        //Entering elements into the array
        System.out.println("Enter" + " " + size + " " + "elements in the array");
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the element in the" + " " + i + " index");
            array[i] = input.nextInt();
        }

        //Enter the element to be searched
        System.out.println("Enter the target");
        int target = input.nextInt();

        //Finding the answer
        int ans = binnarySearch(array, target);
        System.out.println("Target found at index" + " " + ans);
    }

    static int binnarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        //Checking the manner in which the array is arranged
        boolean isAscending = arr[start] < arr[end];
        
        //Code for binary searching
        while(start <= end){
            int middle = start + (end - start)/2;

            if(arr[middle] == target){
                return middle;
            }

            //Condition when array is arranged in ascending order
            if(isAscending){
                if(target < arr[middle]){
                    end = middle - 1;
                }
                else if(target > arr[middle]){
                    start = middle + 1;
                }
            }

            //Condition when array is arranged in descending order
            else{
                if(target > arr[middle]){
                    end = middle - 1;
                }
                else if(target < arr[middle]){
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
