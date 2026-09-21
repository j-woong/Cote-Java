package Programmers.Level_0;

import java.util.*;

public class Solution_n의배수고르기 {
    public int[] solution(int n, int[] numlist) {

        return Arrays.stream(numlist)
                .filter(num -> num % n == 0)
                .toArray();
    }
}
