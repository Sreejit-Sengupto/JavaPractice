import java.util.Scanner;
public class Occurance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number" + " ");
        String n = sc.nextLine().trim();
        System.out.print("Enter the digit whose occurance is to be checked" + " ");
        char d = sc.nextLine().trim().charAt(0);
        
        int c = 0;
        for(int i=0; i<n.length(); i++)
        {
            if(n.charAt(i)==d)
            {
                c++;
            }
        }
        System.out.println(c);
        /*int count = 0;
        int rem = n%10;
        
        if(rem==d)
        {
            count++;
            n = n/10;
        }
        System.out.println(count);*/
    }
}