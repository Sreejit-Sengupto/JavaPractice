import java.util.Scanner;
public class Case
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the character to be checked");
         char c = sc.nextLine().trim().charAt(0);
         
         if(c>='a' && c<='z')
         {
             System.out.println("Lowercase");
         }
         else
         {
             System.out.println("Uppercase");
         }
     }
}