public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Let's take LeetCode contest"));
    }

    static String reverse(String s) {
        String str = "";
        for (int i = 0; i <s.length(); i += s.indexOf(" ") + 1) {
            str += reverseWord(s.substring(s.indexOf(" ")));
        }
        return str.substring(1, str.length());
    }

    static String reverseWord(String word) {
        String str = " ";
        int i = word.length() - 1;
        while (i >= 0) {
            str += word.charAt(i);
            i--;
        }
        return str.substring(1, str.length());
    }
}
