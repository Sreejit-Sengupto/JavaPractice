public class RichestCustomer {
    public static void main(String[] args){

    }

    static int maximumWealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int row = 0; row < arr.length; row++){
            sum = 0;
            for (int col = 0; col < arr[row].length; col++){
                sum += arr[row][col];
            }
            if(sum > max){
                max = sum;
            }
        }
        return sum;
    }
}
