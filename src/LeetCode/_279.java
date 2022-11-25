package LeetCode;

public class _279 {
    public static int numSquares(int n) {
        return (int) Math.sqrt(n);
    }
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numSquares(n));
    }
}
