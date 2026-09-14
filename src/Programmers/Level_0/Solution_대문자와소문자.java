package Programmers.Level_0;

public class Solution_대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";

        for(char ch : my_string.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                answer += (Character.toLowerCase(ch));
            } else {
                answer += (Character.toUpperCase(ch));
            }
        }
        return answer;
    }
}