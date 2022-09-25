import java.util.Scanner;
public class Sum2
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            System.out.println("Press s or S to start and press = to display the sum");
            
            while(true)
            {
                char c = sc.next().trim().charAt(0);
                
                if(c == '=')
                {
                    break;
                }
                else
                {
                    int n = Integer.parseInt("c");
                    sum = sum + n;
                }
            }
            System.out.print("Sum =" + " " + sum);
        }
}