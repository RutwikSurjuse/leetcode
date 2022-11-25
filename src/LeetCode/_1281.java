package LeetCode;

public class _1281 {
    public static int subtractProductAndSum(int n) {
        int p = 1, a = 0;
        while (n>=1) {
                p *= n % 10;
                a += n % 10;
                n/=10;
        }
        return p-a;
    }
    public static void main(String[] args){
        int n = 0;
        System.out.print(subtractProductAndSum(n));
    }
}
