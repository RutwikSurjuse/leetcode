package LeetCode;

import java.util.List;

public class _1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int searchIndex, count = 0;
        if (ruleKey.equals("type")) searchIndex = 0;
        else if (ruleKey.equals("color")) searchIndex = 1;
        else searchIndex = 2;
        for (List<String> item : items) if (item.get(searchIndex).equals(ruleValue)) count++;
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
}
