import java.util.Scanner;
public class Fibonacci
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter upto which range is to be calculated :" + " ");
       int n = sc.nextInt();
       
       int a = 0, b = 1; int c = 0;
       System.out.println(a);
       System.out.println(b);
       while(c<=n)
       {
          c = a + b;
          a = b;
          b = c;
          System.out.println(c);
       }
   }
}