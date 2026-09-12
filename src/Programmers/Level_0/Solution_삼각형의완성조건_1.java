package Programmers.Level_0;


import java.util.Arrays;

public class Solution_삼각형의완성조건_1 {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
