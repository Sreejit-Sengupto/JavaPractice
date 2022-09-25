import java.util.Scanner;

public class FunctionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :" + " ");
        int n = sc.nextInt();
        System.out.print("Enter the character :" + " ");
        char c = sc.next().trim().charAt(0);
        System.out.println(isEven(n));
        System.out.println(digitSum(n));

        if (checkCase(c)) {
            System.out.println("LowerCase");

        } else {
            System.out.println("UpperCase");
        }

    }

    static boolean isEven(int a) {
        return a % 2 == 0;
    }

    static int digitSum(int a) {
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            sum = sum + rem;
            a = a / 10;
        }
        return sum;
    }

    static boolean checkCase(char a) {
        return a >= 'a' && a <= 'z';
    }
}
