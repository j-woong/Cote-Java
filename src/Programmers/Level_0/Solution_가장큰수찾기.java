package Programmers.Level_0;

public class Solution_가장큰수찾기 {
    public int[] solution(int[] array) {
        int max_n = array[0];
        int max_i = 0;
        for(int i = 1; i < array.length; i++) {
            if(max_n < array[i]) {
                max_n = array[i];
                max_i = i;
            }
        }

        return new int[]{max_n,max_i};
    }
}
