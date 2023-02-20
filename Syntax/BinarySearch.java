/* Syntax of Binary Search */

package Syntax;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int ans = binarySearchAscending(array, 22);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist

    //For array sorted in ascending order
    static int binarySearchAscending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            //find the middle element
            int mid = start + (end - start)/2; //Better way to find mid so that int does'nt exceed its value

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                //Answer found
                return mid;
            }
        }
        return -1;
    }


    //For array sorted in descending order
    static int binarySearchDescending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //For array sorted in ascending order
        while(start<=end){
            //find the middle element
            int mid = start + (end - start)/2; //Better way to find mid so that int does'nt exceed its value

            if(target > arr[mid]){
                end = mid - 1;
            } else if(target < arr[mid]){
                start = mid + 1;
            } else {
                //Answer found
                return mid;
            }
        }
        return -1;
    }


    //Order agnostic binary search
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];


        while(start<=end){
            //find the middle element
            int mid = start + (end - start)/2; //Better way to find mid so that int does'nt exceed its value


            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
