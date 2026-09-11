package Programmers.Level_0;

public class Solution_숨어있는숫자의덧셈_1 {
    public int solution(String my_string) {
        int answer = 0;
        for(char ch : my_string.toCharArray()){
            if(Character.isDigit(ch))
                answer += Integer.parseInt(String.valueOf(ch));
        }
        return answer;
    }
}
