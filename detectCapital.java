public class detectCapital {
    public static void main(String[] args) {
        System.out.println(detect("leetcoDe"));
    }

    static boolean detect(String word) {
        String uc = word.toUpperCase();
        String lc  = word.toLowerCase();
        String fc = word.substring(0,1).toUpperCase() + word.substring(1, word.length()).toLowerCase();

        return word.equals(uc) || word.equals(lc) || word.equals(fc);
    }
}
