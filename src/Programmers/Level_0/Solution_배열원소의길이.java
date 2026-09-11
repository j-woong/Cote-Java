package Programmers.Level_0;

import java.util.Arrays;

public class Solution_배열원소의길이 {
    public int[] solution(String[] strlist) {
//         int[] answer = new int[strlist.length];

//         int index = 0;
//         for (String s : strlist) {
//             answer[index++] = s.length();
//         }
//         return answer;

        return Arrays.stream(strlist)
                .mapToInt(String::length).toArray();
    }
}

