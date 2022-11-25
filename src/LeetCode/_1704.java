package LeetCode;

import java.util.Locale;

public class _1704 {
    public static boolean halvesAreAlike(String s) {
        int countA = 0, countB = 0;
        String a = s.substring(0, s.length()/2).toLowerCase();
        String b = s.substring(s.length()/2).toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') countA++;
            if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u') countB++;
        }
        return countA==countB;
    }

    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
}
