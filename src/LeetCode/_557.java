package LeetCode;

public class _557 {
    public static String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder k = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(String str : arr){
            k = new StringBuilder(str);
            res.append(k.reverse()).append(" ");
        }
        return String.valueOf(res.deleteCharAt(res.length()-1));
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
