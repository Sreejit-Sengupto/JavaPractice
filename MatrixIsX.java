public class MatrixIsX {
    public static void main(String[] args) {
        int[][] array = {
                {0,0,0,0,1},
                {0,4,0,1,0},
                {0,0,5,0,0},
                {0,5,0,2,0},
                {4,0,0,0,2}
        };

        System.out.println(checkMatrix(array));
    }

    static boolean checkMatrix(int[][] arr) {
        return checkDiagonal(arr) && checkZero(arr);
    }
    static boolean checkDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] == 0 || arr[i][arr.length - 1 - i] == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean checkZero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                for (int j = 1; j < arr[i].length - 1; j++) {
                    if (arr[i][j] != 0) {
                        return false;
                    }
                }
            } else if (arr[i][0] != 0 && arr[i][arr[i].length - 1] != 0) {
                return false;
            }
        }
        return true;
    }
}
