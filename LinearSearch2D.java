import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows" + " ");
        int row = sc.nextInt();
        System.out.print("Enter number of Columns" + " ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        System.out.print("Enter Elements in the Array" + " ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your entered Array :-");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the value to be searched :" + " ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(searchLinear(array, target)));
        System.out.println("Maximum Value =" + " " + max(array));
    }

    static int[] searchLinear(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
