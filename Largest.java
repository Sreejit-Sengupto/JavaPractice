import java.util.Scanner;
public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b && a>c)
        {
            System.out.println(a + " " + "is the largest");
        }
        if(b>a && b>c)
        {
            System.out.println(b + " " + "is the largest");
        }
        if(c>a && c>b)
        {
            System.out.println(c + " " + "is the largest");
        }
    }
}