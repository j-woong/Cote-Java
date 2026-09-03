package Programmers.Level_2;
import java.util.Arrays;


public class Solution_구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        int left = 0;
        int right = people.length - 1;

        while (left < right) {
            if(people[left] + people[right] > limit) {
                right--;
                answer++;
            } else {
                right--;
                left++;
                answer++;
            }
        }
        if(left == right) {
            answer++;
        }
        return answer;
    }
}
