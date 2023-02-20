import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to be checked for Palindrome");
        String word = input.next();

        int start = 0;
        int last = word.length()-1;
//Create a Function with return type to fix the repeation problem.
        while(last>start){
            if (word.charAt(start) == word.charAt(last)) {
                System.out.println("Palindrome String");
                start++;
                last--;
            } else {
                System.out.println("String is not palindrome");
                break;
            }
        }
    }
}
