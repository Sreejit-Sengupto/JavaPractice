public class EvenMonth
{
        public static void main()
        {
            int c = 0;
            System.out.println("There are 31 Days in the month of August" + " ");
            for(int i=1; i<=31; i++)
            {
                int even  = i%2;
                
                if(even == 0)
                {
                    c++;
                }
            }
            
            System.out.print("Rohan can go out with friends only for" + " " + c + " " + "days" );
        }
}