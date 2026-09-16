package Programmers.Level_2;

import java.util.*;

public class Solution_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int sco : scoville) {
            pq.offer(sco);
        }

        // pq.stream().forEach(System.out::println);

        if(pq.peek() >= K) return 0;

        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first + second * 2);

            answer++;
            if (pq.peek() >= K) {
                break;
            }
        }

        if(pq.size() <= 1 && pq.peek() < K) return -1;
        return answer;
    }
}
