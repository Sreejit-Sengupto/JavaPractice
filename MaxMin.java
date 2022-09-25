import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three Numbers :" + " ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a, b, c);
        min(a, b, c);
    }

    static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max =" + " " + a);
        }
        if (b > a && b > c) {
            System.out.println("Max =" + " " + b);
        }
        if (c > a && c > b) {
            System.out.println("Max =" + " " + c);
        }
    }

    static void min(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("Min =" + " " + a);
        }
        if (b < a && b < c) {
            System.out.println("Min =" + " " + b);
        }
        if (c < a && c < b) {
            System.out.println("Min =" + " " + c);
        }
    }
}
