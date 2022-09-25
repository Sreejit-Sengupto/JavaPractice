import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :" + " ");
        int n = sc.nextInt();
        System.out.print(" " + n + "!" + " " + "=" + " ");
       System.out.print(" " + "=" + " " + factorial(n));
    }

    static int factorial(int n) {
        int factorial = 1;
        if(n == 1 || n == 0){
              factorial = 1;
        }
        for (int i = 1; i <= n; i++) {
            if(n == 1) {
                break;
            }
            if(i == n) {
                System.out.print(i);
            }
            else {
                System.out.print(i + "*");
            }
            factorial = factorial*i;
        }

        return factorial;
    }
}
