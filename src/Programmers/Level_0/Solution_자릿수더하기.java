package Programmers.Level_0;

import java.util.*;

public class Solution_자릿수더하기 {
    public int solution(int n) {
        // int answer = 0;
        // while(n >= 10) {
        //     int remain = n % 10;
        //     n /= 10;
        //     answer += remain;
        // }
        // return answer + n;

        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
