package Programmers.Level_2;

import java.util.Arrays;

public class Solution_가장큰수 {
    public String solution(int[] numbers) {
        String[] strArr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(strArr, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));

        if(strArr[0].equals("0")) {
            return "0";
        }
        return String.join("",strArr);
    }
}
