import java.util.ArrayList;
import java.util.List;

public class SherlockArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(11);
        System.out.println(balancedSums(arr));
    }

    static String balancedSums(List<Integer> arr) {
        // Write your code here
        for (int i = 1; i < arr.size() - 1; i++) {
            int start = 0;
            int end = arr.size() - 1;
            int sumLeft = 0;
            int sumRight = 0;
            while (start < i) {
                sumLeft += arr.get(start);
                start++;
            }

            while (end > i) {
                sumRight += arr.get(end);
                end--;
            }

            if(sumLeft == sumRight) {
                return "YES";
            }
        }
        return "NO";
    }
}
