package LeetCode;

public class _657 {
    public boolean judgeCircle(String moves) {
        int xPosition = 0, yPosition = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') yPosition++;
            else if (moves.charAt(i) == 'D') yPosition--;
            else if (moves.charAt(i) == 'R') xPosition++;
            else if (moves.charAt(i) == 'L') xPosition--;
        }
        return xPosition == 0 && yPosition == 0;
    }
    public static void main(String[] args) {

    }
}
