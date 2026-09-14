package Programmers.Level_0;

import java.util.ArrayList;
import java.util.List;

public class Solution_약수구하기 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list.stream()
                .mapToInt(x -> x)
                .toArray();
    }
}
