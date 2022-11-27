package LeetCode;

public class _67 {
    public static String addBinary(String a, String b) {
        long first = Long.parseLong(a);
        long second = Long.parseLong(b);
        long res1 = 0, res2 = 0, itr1 = 0, itr2 = 0, res = 0, itr = 1;
        while (first > 0) {
            res1 += first % 10 * Math.pow(2, itr1);
            first /= 10;
            itr1++;
        }
        while (second > 0) {
            res2 += second % 10 * Math.pow(2, itr2);
            second /= 10;
            itr2++;
        }
        res1 += res2;
        while (res1 > 0) {
            res += (res1 % 2) * itr;
            itr *= 10;
            res1 /= 2;
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        String a = "1110110101";
        String b = "1110111011";
        System.out.println(addBinary(a, b));
    }
}
