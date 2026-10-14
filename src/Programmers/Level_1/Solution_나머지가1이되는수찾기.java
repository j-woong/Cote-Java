package Programmers.Level_1;

public class Solution_나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 1;
        while(n % answer != 1) {
            answer++;
        }
        return answer;
    }
}
