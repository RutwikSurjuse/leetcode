package LeetCode;

public class _1750 {
    public static int minimumLength(String s) {
        StringBuilder str = new StringBuilder(s);
        while (str.length() > 1 && str.charAt(0) == str.charAt(str.length() - 1)) {
            int start = 0, end = str.length() - 1;
            char charAtStart = str.charAt(start);
            char charAtEnd = str.charAt(end);
            while (str.length() > 0 && charAtStart == str.charAt(end)) {
                str.deleteCharAt(end);
                end = str.length() - 1;
            }
            while (str.length() > 0 && str.charAt(start) == charAtEnd) str.deleteCharAt(start);
        }
        return str.length();
    }

    public static void main(String[] args) {
        String s = "bcbcb";
        System.out.println(minimumLength(s));
    }
}
