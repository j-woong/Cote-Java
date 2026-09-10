package Programmers.Level_0;

import java.util.stream.IntStream;

public class Solution_순서쌍의개수 {
    public int solution(int n) {
        // int answer = 0;
        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0) {
        //         answer++;
        //     }
        // }
        // return answer;

        return (int) IntStream.rangeClosed(1,n).filter(i -> n % i == 0).count();
    }
}
