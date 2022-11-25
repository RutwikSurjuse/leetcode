package LeetCode;

public class _1342 {
    static int count = 0;
    public static int numberOfSteps(int num) {
        if(num==0) return count;
        else if(num%2==0) { //even
            count+=1;
            return numberOfSteps(num/2);
        }
        else if(num%2==1) { //odd
            count+=1;
            return numberOfSteps(num-1);
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 0;
        System.out.println(numberOfSteps(num));
    }
}
