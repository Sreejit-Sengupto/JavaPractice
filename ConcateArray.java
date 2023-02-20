import java.util.Arrays;

public class ConcateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(array)));
    }

    static int[] getConcatenation(int[] arr){
        int[] concatedArr = new int[2*arr.length]; //Creating a new array of double the length of the original array to store the concated array

        for(int i=0; i<arr.length; i++){ 
            concatedArr[i] = arr[i]; //Storing first half elements in the new array
        }

        for(int i=0; i<arr.length; i++){
            concatedArr[arr.length + i] = arr[i]; //Storing the next half elements
        }

        return concatedArr;
    }
}
