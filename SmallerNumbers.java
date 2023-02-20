/* To be checked not final */
import java.util.Arrays;

public class SmallerNumbers{
    public static void main(String[] args) {
        int[] array = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(array)));
    }

    static int[] smallerNumbersThanCurrent(int[] arr){
        int[] countArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    count++;
                }
            }
            countArr[i] = count;
            count = 0;
        }
        return countArr;
    }
}