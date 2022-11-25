package LeetCode;

import java.util.Arrays;

public class _1859 {
    public static String sortSentence(String s) {
        String [] res1 = s.split(" ");
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < res1.length - 1) {
            int lastchar = Character.getNumericValue(res1[i].charAt(res1[i].length()-1));
            if (lastchar != i+1) swap(res1, i, lastchar-1);
            else i++;
        }
        for (String value : res1) result.append(value);
        result.deleteCharAt(result.length()-1);
        StringBuilder res = null;
        for (int j = 0; j < result.length(); j++) res = new StringBuilder(result.toString().replaceAll("[0-9]", " "));
        assert res != null;
        return res.toString();
    }
    static void swap(String [] arr, int firstIndex, int secondIndex){
        String temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
