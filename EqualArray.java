public class EqualArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        System.out.println(check(a, b, 3));
    }

    static boolean check(int[] a, int[] b, int n) {
        sort(a);
        sort(b);
        boolean arrSame = true;

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                arrSame = false;
                break;
            }
        }
        return arrSame;
    }

    static void sort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }
}
