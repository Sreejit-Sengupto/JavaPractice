public class Capitalize {
    public static void main(String[] args) {
        System.out.println(capitalizeWord("First leTTeR of EACH Word"));
    }

    static String capitalizeWord(String title) {
        String newStr = title + " ";
        String ans = "";
        int first = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == 32) {
                String word = newStr.substring(first, i);
                if (word.length() == 1 || word.length() == 2) {
                    ans = ans + " " + word.toLowerCase();
                } else {
                    String firstLetter = word.substring(0,1).toUpperCase();
                    String secondHalf = word.substring(1, word.length()).toLowerCase();
                    String newS = firstLetter +secondHalf;
                    ans = ans + " " + newS;
                }
                first = i + 1;
            }
        }
        return ans.substring(1);
    }
}
