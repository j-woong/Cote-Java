package Programmers.Level_0;

import java.util.*;

public class Solution_배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(String ch1 : s1) {
            for(String ch2 : s2) {
                if(ch1.equals(ch2)) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
