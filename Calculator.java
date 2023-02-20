import java.util.Scanner;
public class Calculator
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the operator to perform the operation" + " ");
            char c = sc.nextLine().trim().charAt(0);
            System.out.print("Enter the first Number" + " ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second Number" + " ");
            int num2 = sc.nextInt();
            
            switch(c)
            {
                case '+' :
                   System.out.print(num1+num2);
                   break;
                case '-' :
                   System.out.print(num1-num2);
                   break;
                case '*' :
                   System.out.print(num1*num2);
                   break;
                case '/' :
                    {
                        if(num2==0)
                        {
                            System.out.print("Denominator cannot be 0");
                        }
                        else
                        {
                            System.out.print(num1/num2);
                        }
                    }
                    break;
                case '%' :
                    System.out.print(num1%num2);
                    break;
                default :
                   System.out.print("Invalid Operator");
            }
        }
}