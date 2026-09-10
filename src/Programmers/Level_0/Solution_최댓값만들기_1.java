package Programmers.Level_0;

import java.util.Arrays;

public class Solution_최댓값만들기_1 {
    public int solution(int[] numbers) {
        int l = numbers.length;
        Arrays.sort(numbers);

        return numbers[l-1] * numbers[l-2];
    }
}