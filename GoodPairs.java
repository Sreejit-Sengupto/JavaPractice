public class GoodPairs {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(array));
    }

    static int numIdenticalPairs(int[] arr){
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
