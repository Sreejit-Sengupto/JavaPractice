public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }

    static String reverseVowels(String str) {
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            if (isVowel(ch[start]) && isVowel(ch[end])) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            } else if (!isVowel(ch[end])) {
                end--;
            } else if (!isVowel(ch[start])) {
                start++;
            }
        }

        String ans = "";
        for(char i : ch) {
            ans += i;
        }

        return ans;
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U';
    }
}
