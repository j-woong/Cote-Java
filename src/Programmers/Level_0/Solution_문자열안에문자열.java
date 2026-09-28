package Programmers.Level_0;

public class Solution_문자열안에문자열 {
    public int solution(String str1, String str2) {
        return (str1.contains(str2) ? 1 : 2);
    }
}
