import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array" + " ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements in the Array" + " ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter Target Value" + " ");
        int target = sc.nextInt();
        System.out.print(linearSearch(array, target));
    }

    //Function will return thr Index Number
    static int linearSearch(int[] array, int targetItem) {
        if(array.length == 0){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == targetItem) {
                return i;
            }
        }
        return -1;
    }
}
