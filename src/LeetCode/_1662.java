package LeetCode;

public class _1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder Word1 = new StringBuilder(), Word2 = new StringBuilder();
        for(String i : word1) Word1.append(i);
        for(String j : word2) Word2.append(j);
        String s1 = Word1.toString();
        String s2 = Word2.toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String [] word1  = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
