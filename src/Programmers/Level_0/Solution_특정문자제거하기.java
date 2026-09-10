package Programmers.Level_0;

public class Solution_특정문자제거하기 {
    public String solution(String my_string, String letter) {
        String answer = "";
        int l = my_string.length();
        for(int i = 0; i < l; i++){
            String ch = my_string.substring(i,i+1);
            if(!ch.equals(letter)){
                answer += ch;
            }
        }
        return answer;
    }
}
