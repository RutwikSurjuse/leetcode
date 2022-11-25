package LeetCode;

import java.util.Arrays;

public class _1304 {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0, m = -(n / 2);
            while (m <= n / 2) {
                if (n % 2 == 0 && m == 0) {
                    m++;
                    continue;
                }
                result[index] = m;
                index++;
                m++;
            }
        return result;
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(Arrays.toString(sumZero(n)));
    }
}
