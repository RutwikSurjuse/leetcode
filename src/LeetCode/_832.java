package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class _832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int [] img : image) {
            int start = 0, end = img.length-1;
            while(start <=end){
                int temp = 1^img[start];
                img[start] = 1^img [end];
                img[end] = temp;
                start++;
                end--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int [][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}
