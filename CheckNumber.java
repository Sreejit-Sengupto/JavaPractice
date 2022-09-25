import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ABOUT : THIS PROGRAM PERFORMS CERTAIN OPERATION ACCORDING TO THE INSTRUCTIONS PROVIDED BY THE USER. READ THE INSTRUCTIONS TO GET STARTED.");
        System.out.println("INSTRUCTIONS : ");
        System.out.println("PRESS '1' FOR CHECKING WHETHER THE ENTERED NUMBER IS PRIME OR NOT");
        System.out.println("PRESS '2' FOR CHECKING WHETHER THE ENTERED NUMBER IS PERFECT OR NOT");
        System.out.println("PRESS '3' FOR CHECKING WHETHER THE ENTERED NUMBER IS EVEN OR ODD");
        System.out.println("PRESS '4' FOR DISPLAYING THE TABLE OF A NUMBER UPTO USER ENTERED RANGE");

        int choice = input.nextInt();
        System.out.print("Enter the Number :" + " ");
        int number = input.nextInt();
        
        switch(choice) {
            case 1 :
            isPrime(number);
            break;

            case 2 :
            if(isPerfect(number)) {
                System.out.print("Perfect Number" + " ");
            }
            else {
                System.out.print("Not a Perfect Number" + " ");
            }
            break;

            case 3 :
            if(isEvenOdd(number)) {
                System.out.print("Entered Number is Even" + " ");
            }
            else {
                System.out.print("Entered Number is Odd");
            }
            break;

            case 4 :
            System.out.print("Enter the number upto which Table is to be printed :" + " ");
            int endValue = input.nextInt();
            table(number, endValue);
        }
    }

    static void isPrime(int a) {
        int c = 2;
        while (c*c < a) {
            if(a % c == 0) {
                System.out.print("Not a Prime");
                break;
            }
            c++;
        }
        System.out.print("Prime Number");
    }

    static boolean isPerfect(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        return sum == a;
    }

    static boolean isEvenOdd(int a) {
        return a % 2 == 0;
    }

    static void table(int a, int b) {
        System.out.println("The Table of" + " " + a + " " + "upto" + " " + b + " " + "is :");
        for (int i = 1; i <= b; i++) {
            System.out.println(a*i);
        }
    }
}
