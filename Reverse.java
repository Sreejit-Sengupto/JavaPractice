import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed" + " ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        while(n>0)
        {
          int rem = n%10;
          sum = sum*10 + rem;
          n = n/10;
        }
        
        System.out.println(sum);
    }
}