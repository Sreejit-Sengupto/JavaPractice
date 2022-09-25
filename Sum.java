import java.util.Scanner;
public class Sum
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            System.out.println("Start entering numbers and press 0 to display the sum");
            
            while(true)
            {
                int n = sc.nextInt();
                
                if(n != 0)
                {
                    sum = sum + n;
                }
                else
                {
                    break;
                }
            }
            System.out.print("Sum =" + " " + sum);
        }
}