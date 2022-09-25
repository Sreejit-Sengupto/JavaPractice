import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array =  new int[3][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(max(array));
    }

    static int max(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            if(sum>max) {
                max = sum;
            }
        }
        return max;
    }
}
