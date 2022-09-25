import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :" + " ");
        int n = sc.nextInt();

        if (n<0) {
            int nCopy = -n;
            System.out.print(-reverse(nCopy));
        }
        else {
            System.out.print(reverse(n));
        }
    }

    static int reverse(int n) {
        int sum = 0;
        
        while(n>0) {
            int rem = n % 10;
            sum = sum*10 + rem;
            n = n/10;
        }
        return sum;
    }
}
