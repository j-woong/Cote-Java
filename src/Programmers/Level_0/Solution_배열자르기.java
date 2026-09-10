package Programmers.Level_0;

import java.util.Arrays;

public class Solution_배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {

//         List<Integer> res = new ArrayList<>();

//         for(int i = num1; i <= num2; i++) {
//             res.add(numbers[i]);
//         }

//         return res.stream()
//             .mapToInt(Integer::intValue).toArray();

        return Arrays.copyOfRange(numbers, num1,num2+1);
    }
}
