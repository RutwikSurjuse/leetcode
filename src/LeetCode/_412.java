package LeetCode;

import java.util.List;

public class _412 {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new java.util.ArrayList<>(List.of());
        for (int i = 1; i <= n; i++) {
            if(i%3==0 && i%5==0) result.add(i-1, "FizzBuzz");
            else if (i%3==0) result.add(i-1, "Fizz");
            else if (i%5==0) result.add(i-1, "Buzz");
            else result.add(i-1, ""+i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(fizzBuzz(n));
    }
}
