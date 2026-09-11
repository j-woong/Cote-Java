package Programmers.Level_2;

import java.util.HashMap;
import java.util.Map;

public class Solution_할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String,Integer> wantMap = new HashMap<>();

        int index = 0;
        for(String w : want) {
            wantMap.put(w,number[index++]);
        }

        for(int i = 0; i <= discount.length - 10; i++) {
            boolean possible = true;

            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            for (String key : wantMap.keySet()) {
                if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                    possible = false;
                    break;
                }
            }
            if(possible) {
                answer++;
            }
        }
        return answer;
    }
}