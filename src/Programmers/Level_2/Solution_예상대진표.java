package Programmers.Level_2;

import java.util.*;

public class Solution_예상대진표 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (Math.abs(a - b) >= 1) {
            answer++;
            if (a % 2 == 0) a = a / 2;
            else a = (a + 1) / 2;

            if (b % 2 == 0) b = b / 2;
            else b = (b + 1) / 2;
        }

        return answer;
    }
}