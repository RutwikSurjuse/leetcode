package LeetCode;

import java.util.List;

public class _1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new java.util.ArrayList<>();
        int max = 0;
        for (int candy : candies) if (candy > max) max = candy;
        for (int candy : candies) result.add(!(candy + extraCandies < max));
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {};
        int extraCandies = 0;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
