package LeetCode;

import java.util.Arrays;

public class _66 {
    public static int[] plusOne(int[] digits) {
        int[] result;
        if(digits[digits.length-1] == 9 && digits[0] == 9) result = new int[digits.length + 1];
        else result = new int[digits.length];
        int i = digits.length-1, index = 1, number = 0;
        while (i >= 0) {
            number += digits[i] * index;
            index*=10;
            i--;
        }
        number++;
        String num = Integer.toString(number);
        for(int a = 0; a < num.length(); a++) result[a] = Integer.parseInt(String.valueOf(num.charAt(a)));
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
