package Programmers.Level_0;

public class Solution_모음제거 {
    public String solution(String my_string) {
//         String answer = "";
//         String moeum = "aeiou";

//         for(int i = 0; i < my_string.length(); i++){
//             String s = my_string.substring(i,i+1);

//             if(!moeum.contains(s)){
//                 answer += s;
//             }
//         }
//         return answer;
        String res = my_string.replaceAll("[aeiou]", "");

        return res;
    }
}
